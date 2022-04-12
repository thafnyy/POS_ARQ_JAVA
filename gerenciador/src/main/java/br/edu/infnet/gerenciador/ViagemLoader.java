package br.edu.infnet.gerenciador;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.domain.Viagem;
import br.edu.infnet.gerenciador.model.service.ViagemService;

@Component
public class ViagemLoader implements ApplicationRunner{

	@Autowired
	private ViagemService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		Viagem v = new Viagem();
		v.setLocalDoInvestimento("CDB XP");
		v.setNome("Cancun em Novembro");
		v.setValor(18000f);
		v.setInternacional(true);
		v.setQtdAcompanhantes(1);
		v.setDataViagem(LocalDateTime.now());
		
		Usuario u = new Usuario();
		u.setId(1);
		v.setUsuario(u);
		
		service.incluir(v);
	
	}

}
