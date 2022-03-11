package br.edu.infnet.gerenciador.model.domain;

import java.util.List;

/**SOLICITANTE
 * Nesta classe vamos criar três atributos 
 * Vamos criar apenas os métodos getters destes atributos
 * Vamos criar um construtor que receba todos os campos.
 * Vamos implementar o toString colocando todos os campos separados por ";". 
 * Use o StringBuilder para realizar esta implementação.
 * */
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

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getIdade() {
		return idade;
	}

	public List<Aporte> getAportes() {
		return aportes;
	}
	
}
