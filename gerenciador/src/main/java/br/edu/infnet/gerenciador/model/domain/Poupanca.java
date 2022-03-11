package br.edu.infnet.gerenciador.model.domain;

import java.time.LocalDateTime;

public class Poupanca extends Meta {

	private float pctRendaAnual;
	
	public Poupanca(String nome, float valor, LocalDateTime dataLimite) {
		super(nome, valor, dataLimite);
	}

	@Override
	public boolean metaEhDificil() {
		return false;
	}

	public float getPctRendaAnual() {
		return pctRendaAnual;
	}

	public void setPctRendaAnual(float pctRendaAnual) {
		this.pctRendaAnual = pctRendaAnual;
	}
	
	
}
