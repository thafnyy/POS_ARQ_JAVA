package br.edu.infnet.gerenciador.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="meta")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Meta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private float valor;
	private String localDoInvestimento;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	@ManyToMany(mappedBy = "metas")
	private List<Aporte> aportes;
	
	public Meta(String nome, float valor, String localDoInvestimento) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.localDoInvestimento = localDoInvestimento;
	}
	
	public Meta() {
	}
	
	public abstract boolean metaEhDificil();
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(localDoInvestimento);
		sb.append(";");
		sb.append(metaEhDificil() ? "meta dificil;" : "meta facil;");
		
		return sb.toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getLocalDoInvestimento() {
		return localDoInvestimento;
	}

	public void setLocalDoInvestimento(String localDoInvestimento) {
		this.localDoInvestimento = localDoInvestimento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Aporte> getAportes() {
		return aportes;
	}

	public void setAportes(List<Aporte> aportes) {
		this.aportes = aportes;
	}

}
