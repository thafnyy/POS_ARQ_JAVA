package br.edu.infnet.gerenciador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.gerenciador.model.domain.Aporte;
import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.service.AporteService;
import br.edu.infnet.gerenciador.model.service.InvestidorService;
import br.edu.infnet.gerenciador.model.service.MetaService;

@Controller
public class AporteController {
	@Autowired
	private AporteService service;
	@Autowired
	private MetaService metaService;
	@Autowired
	private InvestidorService investidorService;
	
	@GetMapping(value="/aporte")
	public String cadastro(Model model, @SessionAttribute("usuario") Usuario usuario) {
		Aporte aporte = new Aporte();
		aporte.setValorAporte(15f);
		
		model.addAttribute("objeto", aporte);
		model.addAttribute("metas", metaService.obterLista(usuario));
		model.addAttribute("investidores", investidorService.obterLista(usuario));
		
		return "aporte/cadastro";
	}
	
	@GetMapping(value="/aportes")
	public String lista(Model model, @SessionAttribute("usuario") Usuario usuario) {
		model.addAttribute("lista", service.obterLista(usuario));
		return "aporte/lista";
	}
	
	@PostMapping(value="/aporte/incluir")
	public String incluir(Aporte aporte, @SessionAttribute("usuario") Usuario usuario) {
		aporte.setUsuario(usuario);
		service.incluir(aporte);
		return "redirect:/aportes";
	}

	@GetMapping(value="/aporte/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/aportes";
	}

}
