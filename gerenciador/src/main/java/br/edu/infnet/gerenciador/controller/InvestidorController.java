package br.edu.infnet.gerenciador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InvestidorController {
	@GetMapping(value="/investidor")
	public String cadastro() {
		return "investidor/cadastro";
	}
	
	@PostMapping(value="/investidor/incluir")
	public String incluir() {
		return "index";
	}
}
