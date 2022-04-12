package br.edu.infnet.gerenciador.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.gerenciador.model.domain.Poupanca;
import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.repository.IPoupancaRepository;

@Service
public class PoupancaService {
	
	@Autowired
	private IPoupancaRepository repository;
	
	public Collection<Poupanca> obterLista(Usuario usuario) {
		return (Collection<Poupanca>) repository.findAll(usuario.getId(), 
				Sort.by(Sort.Direction.ASC, "nome")
				);
	}
	
	public void incluir(Poupanca poupanca) {
		repository.save(poupanca);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
}
