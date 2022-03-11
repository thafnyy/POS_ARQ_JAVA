package br.edu.infnet.gerenciador.model.domain;

import static br.edu.infnet.gerenciador.util.DateUtil.formataData;

import java.time.LocalDateTime;
import java.util.List;


public class Aporte {

	private LocalDateTime data;
	private float valorAporte;

	private List<Meta> metas;
	
	private Investidor usuario;
	
	public Aporte() {
		data = LocalDateTime.now();
		valorAporte = 0.0f;
	}
	
	@Override
	public String toString() {
		return String.format("%s;%.2f;qt de metas: %d", formataData(data), valorAporte, 
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

	public Investidor getUsuario() {
		return usuario;
	}

	public void setUsuario(Investidor usuario) {
		this.usuario = usuario;
	}

	public LocalDateTime getData() {
		return data;
	}
	
}
