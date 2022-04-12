package br.edu.infnet.gerenciador.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.gerenciador.model.domain.Aporte;
import br.edu.infnet.gerenciador.model.repository.IAporteRepository;

@Service
public class AporteService {
	
	@Autowired
	private IAporteRepository repository;
	
	public Collection<Aporte> obterLista() {
		return (Collection<Aporte>) repository.findAll();
	}
	
	public void incluir(Aporte aporte) {
		repository.save(aporte);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
}
