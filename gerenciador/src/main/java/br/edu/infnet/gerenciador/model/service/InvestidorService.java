package br.edu.infnet.gerenciador.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.gerenciador.model.domain.Investidor;
import br.edu.infnet.gerenciador.model.repository.IInvestidorRepository;

@Service
public class InvestidorService {
	
	@Autowired
	private IInvestidorRepository repository;
	
	public Collection<Investidor> obterLista() {
		return (Collection<Investidor>) repository.findAll();
	}
	
	public void incluir(Investidor investidor) {
		repository.save(investidor);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

}
