package br.edu.infnet.gerenciador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PoupancaController {
	@GetMapping(value="/poupanca")
	public String cadastro() {
		return "poupanca/cadastro";
	}
	
	@PostMapping(value="/poupanca/incluir")
	public String incluir() {
		return "index";
	}


}
