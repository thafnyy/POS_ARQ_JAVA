
package br.edu.infnet.gerenciador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ViagemController {
	
	@GetMapping(value="/viagem")
	public String cadastro() {
		return "viagem/cadastro";
	}
	
	@PostMapping(value="/viagem/incluir")
	public String incluir() {
		return "index";
	}
}
