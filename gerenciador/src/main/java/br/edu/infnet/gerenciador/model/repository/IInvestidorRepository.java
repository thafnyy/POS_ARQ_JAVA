package br.edu.infnet.gerenciador.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.gerenciador.model.domain.Investidor;

@Repository
public interface IInvestidorRepository extends CrudRepository<Investidor, Integer>{

}
