package br.edu.infnet.gerenciador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.gerenciador.model.domain.Produto;
import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.service.ProdutoService;
import br.edu.infnet.gerenciador.util.TipoProdutoConstante;

@Component
public class ProdutoLoader implements ApplicationRunner{

	@Autowired
	private ProdutoService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		Usuario u = new Usuario();
		u.setId(1);

		if(service.obterLista(u).isEmpty()) {
			System.out.println("Incluindo produto padrao");

			Produto p = new Produto("Notebook", 8000f, "Itau");
			p.setEntrada(false);
			p.setMarca("Dell");
			p.setTipoProduto(TipoProdutoConstante.ELETRONICO);
	
			p.setUsuario(u);
			
			service.incluir(p);
		}	
	}

}
