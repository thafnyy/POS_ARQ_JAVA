package br.edu.infnet.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto extends Meta {

	private String tipoProduto;
	private String marca;
	private boolean entrada; //objetivo eh juntar apenas o valor de entrada ou valor total... verificar
}
