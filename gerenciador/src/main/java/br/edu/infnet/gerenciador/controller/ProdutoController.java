package br.edu.infnet.gerenciador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.gerenciador.model.domain.Produto;
import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.service.ProdutoService;
import br.edu.infnet.gerenciador.util.TipoProdutoConstante;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping(value="/produto")
	public String cadastro(Model model) {
		Produto p = new Produto("Notebook", 8000f, "Itau");
		p.setEntrada(false);
		p.setMarca("Dell");
		p.setTipoProduto(TipoProdutoConstante.ELETRONICO);
		
		model.addAttribute("objeto", p);

		return "produto/cadastro";
	}
	

	@GetMapping(value="/produtos")
	public String lista(Model model, @SessionAttribute("usuario") Usuario usuario) {
		model.addAttribute("lista", service.obterLista(usuario));
		return "produto/lista";
	}
	
	@PostMapping(value="/produto/incluir")
	public String incluir(Produto produto, @SessionAttribute("usuario") Usuario usuario) {
		produto.setUsuario(usuario);
		service.incluir(produto);
		return "redirect:/produtos";
	}
	
	@GetMapping(value="/produto/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/produtos";
	}
}
