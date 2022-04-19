package br.edu.infnet.gerenciador.model.domain;

import static br.edu.infnet.gerenciador.util.DateUtil.formataData;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="aporte")
public class Aporte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime data;
	private float valorAporte;
	
	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idInvestidor")	
	private Investidor investidor;
	
	@ManyToMany(cascade = CascadeType.DETACH)	
	private List<Meta> metas;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public Aporte() {
		this.data = LocalDateTime.now();
	}
	
	
	@Override
	public String toString() {
		return String.format("Data do Aporte: %s; Valor do Aporte: %.2f; "
				+ "Investidor: [%s]; Qtd Metas: %d", 
				formataData(data), 
				valorAporte, 
				investidor,
				null == metas || metas.isEmpty() ? 0 : metas.size());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public float getValorAporte() {
		return valorAporte;
	}

	public void setValorAporte(float valorAporte) {
		this.valorAporte = valorAporte;
	}

	public Investidor getInvestidor() {
		return investidor;
	}

	public void setInvestidor(Investidor investidor) {
		this.investidor = investidor;
	}

	public List<Meta> getMetas() {
		return metas;
	}

	public void setMetas(List<Meta> metas) {
		this.metas = metas;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}
