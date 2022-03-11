package br.edu.infnet.gerenciador.model.domain;

import br.edu.infnet.gerenciador.util.TipoProdutoConstante;

/**CLASSES FILHAS (BEBIDA, COMIDA, SOBREMESA)
 * Crie os atributos e os métodos getters/setters para todos.
 * Obrigatoriamente, implemente o construtor da mãe e o método abstrato. 
 * Crie o toString chamando o método que foi sobrescrito.
 * No método abstrato, crie uma regra de negócio que utilize atributos da filha e da mãe.
 * Crie um teste para trabalhar a instância com o construtor e retorno do tostring.
 * Crie um teste para trabalhar com o retorno do método abstrato.*/

public class Produto extends Meta {

	private String tipoProduto;
	private String marca;
	private boolean entrada; //objetivo eh juntar apenas o valor de entrada ou valor total... verificar

	public Produto(String nome, float valor, String localDoInvestimento) {
		super(nome, valor, localDoInvestimento);
	}
	
	@Override
	public boolean metaEhDificil() {
		return getValor() > 15000 || 
				tipoProduto.equals(TipoProdutoConstante.CARRO) ||
				tipoProduto.equals(TipoProdutoConstante.IMOVEL);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		String str = String.format("Tipo do Produto: %s; "
				+ "Marca do Produto: %s; "
				+ "A meta %s é juntar apenas a entrada", 
				tipoProduto, 
				marca, 
				entrada ? "" : "nao");
		
		sb.append(str);
		
		return sb.toString();
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
