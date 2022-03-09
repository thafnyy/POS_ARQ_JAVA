package br.edu.infnet.gerenciador.model.domain;

import static br.edu.infnet.gerenciador.util.DateUtil.formataData;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
public class Aporte {

	private LocalDateTime data;
	
	@Setter
	private float valorAporte;

	@Setter
	private List<Meta> metas;
	
	@Setter
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
	
	
}
