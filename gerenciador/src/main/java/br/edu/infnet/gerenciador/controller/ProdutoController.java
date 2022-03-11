package br.edu.infnet.gerenciador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProdutoController {
	@GetMapping(value="/produto")
	public String cadastro() {
		return "produto/cadastro";
	}
	
	@PostMapping(value="/produto/incluir")
	public String incluir() {
		return "index";
	}
}
