package br.edu.infnet.gerenciador.model.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto extends Meta {

	private String tipoProduto;
	private String marca;
	private boolean entrada; //objetivo eh juntar apenas o valor de entrada ou valor total... verificar

	public Produto(String nome, float valor, LocalDateTime dataLimite) {
		super(nome, valor, dataLimite);
	}

	@Override
	public boolean metaEhDificil() {
		return false;
	}
	
	
}
