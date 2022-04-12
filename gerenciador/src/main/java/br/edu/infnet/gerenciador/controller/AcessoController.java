package br.edu.infnet.gerenciador.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.service.UsuarioService;

@SessionAttributes("usuario")
@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping(value="/")
	public String telaIndex() {
		return "index";
	}
	
	@GetMapping(value="/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value="/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		Usuario usuario = service.autenticacao(email, senha);
		if(usuario != null) {
			model.addAttribute("usuario", usuario);
			return "index";
		}
		model.addAttribute("message", "Usuário ou senha inválidos");
		return "login";
	}

	@GetMapping(value="/logout")
	public String logout(HttpSession session, SessionStatus status) {
		//remove o cara da sessao
		status.setComplete();
		session.removeAttribute("usuario");
		
		return "redirect:/";
	}



}
