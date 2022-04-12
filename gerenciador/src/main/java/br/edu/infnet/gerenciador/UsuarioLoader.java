package br.edu.infnet.gerenciador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner{

	@Autowired
	private UsuarioService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		String email = "thafny@outlook.com";
		String senha = "123456";
		
		if(service.autenticacao(email, senha) == null) {
			System.out.println("Incluindo usuario padrao");
			Usuario u = new Usuario();
			u.setEmail(email);
			u.setNome("Thafny");
			u.setSenha(senha);
			u.setAdmin(true);
			service.incluir(u);
		}
	
	}

}
