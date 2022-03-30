package br.edu.infnet.gerenciador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcessoController {
	@GetMapping(value="/")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value="/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		if(senha.length() < 5) {
			model.addAttribute("message", "Usuário ou senha inválidos");
			return "login";
		}
		return "index";
	}




}
