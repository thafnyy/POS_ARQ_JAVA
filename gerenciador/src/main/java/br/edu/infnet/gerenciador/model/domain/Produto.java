package br.edu.infnet.gerenciador.model.domain;

import java.time.LocalDateTime;

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

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isEntrada() {
		return entrada;
	}

	public void setEntrada(boolean entrada) {
		this.entrada = entrada;
	}
	
	
}
