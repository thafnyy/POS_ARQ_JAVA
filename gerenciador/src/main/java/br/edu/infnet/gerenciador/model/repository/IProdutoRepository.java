package br.edu.infnet.gerenciador.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.gerenciador.model.domain.Produto;

@Repository
public interface IProdutoRepository extends CrudRepository<Produto, Integer>{
	
	@Query("from Produto p where p.usuario.id = :id")
	Collection<Produto> findAll(Integer id, Sort by);

	
}
