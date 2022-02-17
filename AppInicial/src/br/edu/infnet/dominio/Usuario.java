package br.edu.infnet.dominio;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
	private String nome;
	private List<Aporte> aportes;
}
