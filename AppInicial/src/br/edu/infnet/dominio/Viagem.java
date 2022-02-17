package br.edu.infnet.dominio;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Viagem extends Meta {

	private boolean internacional;
	private int qtdAcompanhantes;
	private Date dataViagem;
}
