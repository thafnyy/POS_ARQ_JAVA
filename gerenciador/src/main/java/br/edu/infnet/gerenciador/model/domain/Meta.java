package br.edu.infnet.gerenciador.model.domain;

import static br.edu.infnet.gerenciador.util.DateUtil.formataData;

import java.time.LocalDateTime;

public abstract class Meta {

	private String nome;
	private float valor;
	private LocalDateTime dataLimite;
	
	public Meta(String nome, float valor, LocalDateTime dataLimite) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.dataLimite = dataLimite;
	}
	
	public abstract boolean metaEhDificil();
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(formataData(dataLimite));
		sb.append(";");
		sb.append(metaEhDificil() ? "meta dificil" : "meta facil");
		
		return sb.toString();
	}

	public String getNome() {
		return nome;
	}

	public float getValor() {
		return valor;
	}

	public LocalDateTime getDataLimite() {
		return dataLimite;
	}
	
	
}
