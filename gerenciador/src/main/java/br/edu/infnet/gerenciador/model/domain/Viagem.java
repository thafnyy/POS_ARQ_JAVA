package br.edu.infnet.gerenciador.model.domain;

import static br.edu.infnet.gerenciador.util.DateUtil.formataData;

import java.time.LocalDateTime;

public class Viagem extends Meta {

	private boolean internacional;
	private int qtdAcompanhantes;
	private LocalDateTime dataViagem;
	
	public Viagem(String nome, float valor, LocalDateTime dataLimite) {
		super(nome, valor, dataLimite);
	}
	
	@Override
	public boolean metaEhDificil() {
		if(getValor() > 5000f || internacional) return true;
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(internacional ? "viagem internacional" : "viagem nacional");
		sb.append(";");
		sb.append(formataData(dataViagem));
		sb.append(";");
		sb.append(qtdAcompanhantes);
		sb.append(";");
		
		
		return super.toString();
	}

	public boolean isInternacional() {
		return internacional;
	}

	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}

	public int getQtdAcompanhantes() {
		return qtdAcompanhantes;
	}

	public void setQtdAcompanhantes(int qtdAcompanhantes) {
		this.qtdAcompanhantes = qtdAcompanhantes;
	}

	public LocalDateTime getDataViagem() {
		return dataViagem;
	}

	public void setDataViagem(LocalDateTime dataViagem) {
		this.dataViagem = dataViagem;
	}
	
	
}
