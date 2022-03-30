package br.edu.infnet.gerenciador.model.domain;

import static br.edu.infnet.gerenciador.util.DateUtil.formataData;

import java.time.LocalDateTime;
import java.util.List;

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
