
package br.edu.infnet.gerenciador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping(value="/usuario")
	public String cadastro(Model model) {
		return "usuario/cadastro";
	}
	
//	@GetMapping(value="/usuarios")
//	public String lista(Model model) {
//		model.addAttribute("lista", service.obterLista());
//		return "usuario/lista";
//	}
	
	@PostMapping(value="/usuario/incluir")
	public String incluir(Usuario usuario) {
		service.incluir(usuario);
		return "redirect:/";
	}
}
