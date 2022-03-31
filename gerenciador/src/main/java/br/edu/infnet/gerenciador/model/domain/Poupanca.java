package br.edu.infnet.gerenciador.model.domain;

public class Poupanca extends Meta {

	private float pctRendaAnual;
	private String prazo;
	private boolean liquidezDiaria;
	
	public Poupanca(String nome, float valor, String localDoInvestimento) {
		super(nome, valor, localDoInvestimento);
	}

	@Override
	public boolean metaEhDificil() {
		return getValor() > 50000 || prazo.equals("Longo");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		String str = String.format("Percentual de Renda Anual Previsto: %.2f; "
				+ "Prazo do Investimento: %s; "
				+ "Esse investimento %s tem liquidez diaria", 
				pctRendaAnual, 
				prazo, 
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

	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public boolean isLiquidezDiaria() {
		return liquidezDiaria;
	}

	public void setLiquidezDiaria(boolean liquidezDiaria) {
		this.liquidezDiaria = liquidezDiaria;
	}
	
}
