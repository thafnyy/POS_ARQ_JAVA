package br.edu.infnet.gerenciador.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.domain.Viagem;
import br.edu.infnet.gerenciador.model.repository.IViagemRepository;

@Service
public class ViagemService {

	@Autowired
	private IViagemRepository repository;
	
	public Collection<Viagem> obterLista(Usuario usuario) {
		return (Collection<Viagem>) repository.findAll(usuario.getId(), 
				Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void incluir(Viagem viagem) {
		repository.save(viagem);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}
