package br.edu.infnet.gerenciador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner{

	@Autowired
	private UsuarioService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Incluindo usuario padrao");
		Usuario u = new Usuario();
		u.setEmail("thafny@outlook.com");
		u.setNome("Thafny");
		u.setSenha("123456");
		u.setAdmin(true);
		
		service.incluir(u);
	}

}
