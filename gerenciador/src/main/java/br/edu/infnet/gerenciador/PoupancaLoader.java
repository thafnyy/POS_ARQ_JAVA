package br.edu.infnet.gerenciador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.gerenciador.model.domain.Poupanca;
import br.edu.infnet.gerenciador.model.domain.Prazo;
import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.service.PoupancaService;

@Component
public class PoupancaLoader implements ApplicationRunner{

	@Autowired
	private PoupancaService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario u = new Usuario();
		u.setId(1);

		if(service.obterLista(u).isEmpty()) {
			System.out.println("Incluindo poupanca padrao");

			Poupanca p = new Poupanca("Aposentadoria", 500000f, "Itau");
			p.setLiquidezDiaria(false);
			p.setPctRendaAnual(9.0f);
			p.setPrazo(Prazo.LONGO.getPrazo());
	
			p.setUsuario(u);
			service.incluir(p);
		}
	
	}

}
