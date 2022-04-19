package br.edu.infnet.gerenciador.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.gerenciador.model.domain.Meta;

@Repository
public interface IMetaRepository extends CrudRepository<Meta, Integer>{

	@Query("from Meta m where m.usuario.id = :id")
	Collection<Meta> findAll(Integer id, Sort by);

	
}
