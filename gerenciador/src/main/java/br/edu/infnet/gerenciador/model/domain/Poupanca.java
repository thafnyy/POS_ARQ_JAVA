package br.edu.infnet.gerenciador.model.domain;

/**CLASSES FILHAS (BEBIDA, COMIDA, SOBREMESA)
 * Crie os atributos e os métodos getters/setters para todos.
 * Obrigatoriamente, implemente o construtor da mãe e o método abstrato.
 * Crie o toString chamando o método que foi sobrescrito.
 * No método abstrato, crie uma regra de negócio que utilize atributos da filha e da mãe.
 * Crie um teste para trabalhar a instância com o construtor e retorno do tostring.
 * Crie um teste para trabalhar com o retorno do método abstrato.
 * */
public class Poupanca extends Meta {

	private float pctRendaAnual;
	private Prazo prazo;
	private boolean liquidezDiaria;
	
	public Poupanca(String nome, float valor, String localDoInvestimento) {
		super(nome, valor, localDoInvestimento);
	}

	@Override
	public boolean metaEhDificil() {
		return getValor() > 50000 || prazo.equals(Prazo.LONGO);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		String str = String.format("Percentual de Renda Anual Previsto: %.2f; "
				+ "Prazo do Investimento: %s; "
				+ "Esse investimento %s tem liquidez diaria", 
				pctRendaAnual, 
				prazo.getPrazo(), 
				liquidezDiaria ? "" : "nao");
		
		sb.append(str);
		
		return sb.toString();
	}

	public float getPctRendaAnual() {
		return pctRendaAnual;
	}

	public void setPctRendaAnual(float pctRendaAnual) {
		this.pctRendaAnual = pctRendaAnual;
	}

	public Prazo getPrazo() {
		return prazo;
	}

	public void setPrazo(Prazo prazo) {
		this.prazo = prazo;
	}

	public boolean isLiquidezDiaria() {
		return liquidezDiaria;
	}

	public void setLiquidezDiaria(boolean liquidezDiaria) {
		this.liquidezDiaria = liquidezDiaria;
	}
	
}
