package br.edu.infnet.gerenciador.model.domain;

import java.util.List;

import lombok.Getter;

@Getter
public class Investidor {
	private String nome;
	private String email;
	private int idade;
	
	private List<Aporte> aportes;
	
	public Investidor(String nome, String email, int idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(email);
		sb.append(";");
		sb.append(idade);
		
		return sb.toString();
	}
	
	
}
