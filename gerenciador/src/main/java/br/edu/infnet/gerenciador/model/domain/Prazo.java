package br.edu.infnet.gerenciador.model.domain;

public enum Prazo {
	CURTO("Curto"),
	MEDIO("Médio"),
	LONGO("Longo");
	
	private String prazo;
	
	Prazo(String prazo) {
		this.prazo = prazo;
	}
	
	public String getPrazo() {
		return prazo;
	}
	
}
