package br.edu.infnet.gerenciador.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.repository.IUsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository repository;
	
	public Usuario autenticacao(String email, String senha) {
		return repository.autenticacao(email, senha);
	}
	
	public Usuario incluir(Usuario usuario) {
		return repository.save(usuario);
	}
	
}
