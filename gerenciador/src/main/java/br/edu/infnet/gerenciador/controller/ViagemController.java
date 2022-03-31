
package br.edu.infnet.gerenciador.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.gerenciador.model.domain.Viagem;
import br.edu.infnet.gerenciador.model.service.ViagemService;

@Controller
public class ViagemController {
	
	@Autowired
	private ViagemService service;
	
	@GetMapping(value="/viagem")
	public String cadastro(Model model) {
		Viagem v1 = new Viagem("Viagem para Machu Pichu", 10000, "Nubank");
		v1.setDataViagem(LocalDateTime.of(2023, 07, 01, 0, 0));
		v1.setInternacional(false);
		v1.setQtdAcompanhantes(1);
		
		model.addAttribute("objeto", v1);
		return "viagem/cadastro";
	}
	
	@GetMapping(value="/viagens")
	public String lista(Model model) {
		model.addAttribute("lista", service.obterLista());
		return "viagem/lista";
	}
	
	@PostMapping(value="/viagem/incluir")
	public String incluir(Viagem viagem) {
		service.incluir(viagem);
		return "redirect:/viagens";
	}
	
	@GetMapping(value="/viagem/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/viagens";
	}
}
