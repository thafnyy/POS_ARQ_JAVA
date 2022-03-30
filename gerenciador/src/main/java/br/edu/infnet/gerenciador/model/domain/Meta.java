package br.edu.infnet.gerenciador.model.domain;

/**PRODUTO
 * 
 * Vamos tornar a classe mãe abstrata e criar os atributos.
 * Vamos criar um construtor que receba todos os campos. Os atributos terão apenas os métodos "get".
 * Crie um método abstrato que retorne alguma informação (retorno diferente de void)
 * Vamos implementar o toString colocando todos os campos separados por ";". 
 * Use o StringBuilder para realizar esta implementação.
 * Crie uma classe com três testes - uma para cada filha. O objetivo é testar se 
 * o construtor está retornando o objeto instanciado.*/

public abstract class Meta {

	private Integer id;
	private String nome;
	private float valor;
	private String localDoInvestimento;
	
	public Meta(String nome, float valor, String localDoInvestimento) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.localDoInvestimento = localDoInvestimento;
	}
	
	public abstract boolean metaEhDificil();
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(localDoInvestimento);
		sb.append(";");
		sb.append(metaEhDificil() ? "meta dificil;" : "meta facil;");
		
		return sb.toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getLocalDoInvestimento() {
		return localDoInvestimento;
	}

	public void setLocalDoInvestimento(String localDoInvestimento) {
		this.localDoInvestimento = localDoInvestimento;
	}

}
