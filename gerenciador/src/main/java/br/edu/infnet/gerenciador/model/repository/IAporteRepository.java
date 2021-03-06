package br.edu.infnet.gerenciador.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.gerenciador.model.domain.Aporte;

@Repository
public interface IAporteRepository extends CrudRepository<Aporte, Integer>{
	
	@Query("from Aporte a where a.usuario.id = :id")
	Collection<Aporte> findAll(Integer id, Sort by);

	Collection<Aporte> findAll(Sort by);
}
