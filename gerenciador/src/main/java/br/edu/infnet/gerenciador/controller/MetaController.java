
package br.edu.infnet.gerenciador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.service.MetaService;

@Controller
public class MetaController {
	
	@Autowired
	private MetaService service;
	
	@GetMapping(value="/metas")
	public String lista(Model model, @SessionAttribute("usuario") Usuario usuario) {
		model.addAttribute("lista", service.obterLista(usuario));
		return "meta/lista";
	}
	
	@GetMapping(value="/meta/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/metas";
	}
}
