package br.edu.infnet.gerenciador.model.domain;

import static br.edu.infnet.gerenciador.util.DateUtil.formataData;

import java.time.LocalDateTime;
import java.util.List;

/**PEDIDO
 * Nesta classe vamos precisar de três atributos: 
 * 		um precisa ser do tipo LocalDateTime (private LocalDateTime data;)
 * 		outro precisa ser o relacionamento com a classe de associação
 * 		e um outro qualquer.
 * 
 * Num construtor padrão, vamos iniciar o campo do tipo LocalDateTime com a 
 * data/hora de hoje (data = LocalDateTime.now();) e vamos definir um valor 
 * inicial para o outro atributo
 * Apenas o campo de data não terá o método "set"; o campo de relacionamento 
 * com a classe de associação e outro campo terão getters/setters.
 * 
 * Implemente o método toString através do String.format para retornar todos os 
 * campos separados por ";".
 * 
 * No toString, vamos precisar criar um formato para exibição da data: 
 * DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
 * 
 * E no campo do toString aplicar o formato na hora de exibir: 
 * this.data.format(formato)
 * 
 * Crie um teste para a associação do solicitante ao pedido. 
 * 
 * 
 * Na classe de pedido, vamos criar um atributo do tipo lista de produtos.
 * Não deixe de criar os getters/setters deste novo atributo.
 * Um pedido pode ter um ou vários produtos.
 * No toString de pedido, vamos colocar a quantidade de produtos existentes no pedido.
 * Volte na classe de teste de pedido, instancie três produtos e associe ao pedido.. 
 * exiba o toString para saber se funcionou.
 * */
public class Aporte {

	private LocalDateTime data;
	private float valorAporte;
	private Investidor investidor;
	private List<Meta> metas;
	
	public Aporte() {
		data = LocalDateTime.now();
		valorAporte = 0.0f;
	}
	
	@Override
	public String toString() {
		return String.format("Data do Aporte: %s; Valor do Aporte: %.2f; "
				+ "Investidor: [%s]; Qtd Metas: %d", 
				formataData(data), 
				valorAporte, 
				investidor,
				null == metas || metas.isEmpty() ? 0 : metas.size());
	}

	public float getValorAporte() {
		return valorAporte;
	}

	public void setValorAporte(float valorAporte) {
		this.valorAporte = valorAporte;
	}

	public List<Meta> getMetas() {
		return metas;
	}

	public void setMetas(List<Meta> metas) {
		this.metas = metas;
	}

	public Investidor getInvestidor() {
		return investidor;
	}

	public void setInvestidor(Investidor investidor) {
		this.investidor = investidor;
	}

	public LocalDateTime getData() {
		return data;
	}
	
}
