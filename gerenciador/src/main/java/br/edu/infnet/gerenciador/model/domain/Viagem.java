package br.edu.infnet.gerenciador.model.domain;

import static br.edu.infnet.gerenciador.util.DateUtil.formataData;

import java.time.LocalDateTime;

/**CLASSES FILHAS (BEBIDA, COMIDA, SOBREMESA)
 * 
 * Crie os atributos e os métodos getters/setters para todos.
 * Obrigatoriamente, implemente o construtor da mãe e o método abstrato. 
 * Crie o toString chamando o método que foi sobrescrito.
 * No método abstrato, crie uma regra de negócio que utilize atributos da filha e da mãe.
 * Crie um teste para trabalhar a instância com o construtor e retorno do tostring.
 * Crie um teste para trabalhar com o retorno do método abstrato.*/
public class Viagem extends Meta {

	private boolean internacional;
	private int qtdAcompanhantes;
	private LocalDateTime dataViagem;
	
	public Viagem(String nome, float valor, String localDoInvestimento) {
		super(nome, valor, localDoInvestimento);
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
		
		
		return sb.toString();
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
