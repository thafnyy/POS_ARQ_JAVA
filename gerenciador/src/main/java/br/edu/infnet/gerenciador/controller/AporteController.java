package br.edu.infnet.gerenciador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AporteController {
	@GetMapping(value="/aporte")
	public String cadastro() {
		return "aporte/cadastro";
	}
	
	@PostMapping(value="/aporte/incluir")
	public String incluir() {
		return "index";
	}




}
