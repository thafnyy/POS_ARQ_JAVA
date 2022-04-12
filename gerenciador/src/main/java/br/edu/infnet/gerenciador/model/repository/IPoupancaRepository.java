package br.edu.infnet.gerenciador.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.gerenciador.model.domain.Poupanca;

@Repository
public interface IPoupancaRepository extends CrudRepository<Poupanca, Integer>{
	
	@Query("from Poupanca p where p.usuario.id = :id")
	Collection<Poupanca> findAll(Integer id, Sort by);

	
}
