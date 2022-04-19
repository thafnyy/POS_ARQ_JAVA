package br.edu.infnet.gerenciador;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.gerenciador.model.domain.Aporte;
import br.edu.infnet.gerenciador.model.service.AporteService;

@Component
public class AporteLoader implements ApplicationRunner{

	@Autowired
	private AporteService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		if(service.obterLista().isEmpty()) {
			System.out.println("Incluindo aporte padrao");

			Aporte aporte = new Aporte();
			aporte.setValorAporte(15f);
			aporte.setData(LocalDateTime.now());
			
			service.incluir(aporte);
		}
	}

}
