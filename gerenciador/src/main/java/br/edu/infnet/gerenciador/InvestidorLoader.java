package br.edu.infnet.gerenciador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.gerenciador.model.domain.Investidor;
import br.edu.infnet.gerenciador.model.service.InvestidorService;

@Component
public class InvestidorLoader implements ApplicationRunner{

	@Autowired
	private InvestidorService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Incluindo investidor padrao");
		Investidor i = new Investidor();
		i.setNome("Thafny");
		i.setIdade(27);
		i.setEmail("thafny@outlook.com");
		
		service.incluir(i);
	}

}
