package br.edu.infnet.gerenciador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.gerenciador.model.domain.Investidor;
import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.service.InvestidorService;

@Controller
public class InvestidorController {
	
	@Autowired
	private InvestidorService service;
	
	@GetMapping(value="/investidor")
	public String cadastro() {
		return "investidor/cadastro";
	}
	
	@GetMapping(value="/investidores")
	public String lista(Model model, @SessionAttribute("usuario") Usuario usuario) {
		model.addAttribute("lista", service.obterLista(usuario));
		return "investidor/lista";
	}
	
	@PostMapping(value="/investidor/incluir")
	public String incluir(Investidor investidor, @SessionAttribute("usuario") Usuario usuario) {
		
		investidor.setUsuario(usuario);
		
		service.incluir(investidor);
		return "redirect:/investidores";
	}
	
	@GetMapping(value="/investidor/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/investidores";
	}
}
