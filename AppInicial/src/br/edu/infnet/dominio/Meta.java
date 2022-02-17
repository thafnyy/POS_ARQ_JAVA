package br.edu.infnet.dominio;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Meta {

	private String nome;
	private float valor;
	private Date dataLimite;
}
