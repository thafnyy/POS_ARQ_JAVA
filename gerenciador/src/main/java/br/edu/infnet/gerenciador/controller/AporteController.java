package br.edu.infnet.gerenciador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.gerenciador.model.domain.Aporte;
import br.edu.infnet.gerenciador.model.service.AporteService;

@Controller
public class AporteController {
	@Autowired
	private AporteService service;
	
	@GetMapping(value="/aporte")
	public String cadastro(Model model) {
		Aporte aporte = new Aporte();
		aporte.setValorAporte(15f);
		
		model.addAttribute("objeto", aporte);

		return "aporte/cadastro";
	}
	
	@GetMapping(value="/aportes")
	public String lista(Model model) {
		model.addAttribute("lista", service.obterLista());
		return "aporte/lista";
	}
	
	@PostMapping(value="/aporte/incluir")
	public String incluir(Aporte aporte) {
		service.incluir(aporte);
		return "redirect:/aportes";
	}

	@GetMapping(value="/aporte/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/aportes";
	}

}
