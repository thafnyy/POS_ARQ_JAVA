package br.edu.infnet.dominio;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aporte {
	private Date data;
	private float valorAporte;
	List<Meta> metas;
}
