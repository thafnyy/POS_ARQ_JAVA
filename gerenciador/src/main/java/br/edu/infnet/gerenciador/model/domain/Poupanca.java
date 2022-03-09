package br.edu.infnet.gerenciador.model.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Poupanca extends Meta {

	private float pctRendaAnual;
	
	public Poupanca(String nome, float valor, LocalDateTime dataLimite) {
		super(nome, valor, dataLimite);
	}

	@Override
	public boolean metaEhDificil() {
		return false;
	}
	
}
