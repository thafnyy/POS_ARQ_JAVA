package br.edu.infnet.gerenciador.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
	
	public Collection<Usuario> obterLista() {
		return (Collection<Usuario>) repository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}
