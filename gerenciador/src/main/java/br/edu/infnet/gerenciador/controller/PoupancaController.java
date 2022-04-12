package br.edu.infnet.gerenciador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.gerenciador.model.domain.Poupanca;
import br.edu.infnet.gerenciador.model.domain.Prazo;
import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.service.PoupancaService;

@Controller
public class PoupancaController {
	
	@Autowired
	private PoupancaService service;
	
	@GetMapping(value="/poupanca")
	public String cadastro(Model model) {
		
		Poupanca p = new Poupanca("Aposentadoria", 500000f, "Itau");
		p.setLiquidezDiaria(false);
		p.setPctRendaAnual(9.0f);
		p.setPrazo(Prazo.LONGO.getPrazo());
		
		model.addAttribute("objeto", p);
		return "poupanca/cadastro";
	}
	
	@GetMapping(value="/poupancas")
	public String lista(Model model, @SessionAttribute("usuario") Usuario usuario) {
		model.addAttribute("lista", service.obterLista(usuario));
		return "poupanca/lista";
	}
	
	@PostMapping(value="/poupanca/incluir")
	public String incluir(Poupanca poupanca, @SessionAttribute("usuario") Usuario usuario) {
		poupanca.setUsuario(usuario);
		service.incluir(poupanca);
		return "redirect:/poupancas";
	}
	
	@GetMapping(value="/poupanca/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/poupancas";
	}


}
