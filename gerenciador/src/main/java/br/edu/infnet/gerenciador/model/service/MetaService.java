package br.edu.infnet.gerenciador.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.gerenciador.model.domain.Meta;
import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.repository.IMetaRepository;

@Service
public class MetaService {

	@Autowired
	private IMetaRepository repository;
	
	public Collection<Meta> obterLista(Usuario usuario) {
		return (Collection<Meta>) repository.findAll(usuario.getId(), 
				Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}
