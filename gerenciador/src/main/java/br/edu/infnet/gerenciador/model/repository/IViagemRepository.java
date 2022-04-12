package br.edu.infnet.gerenciador.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.gerenciador.model.domain.Viagem;

@Repository
public interface IViagemRepository extends CrudRepository<Viagem, Integer>{

	@Query("from Viagem v where v.usuario.id = :id")
	Collection<Viagem> findAll(Integer id, Sort by);

	
}
