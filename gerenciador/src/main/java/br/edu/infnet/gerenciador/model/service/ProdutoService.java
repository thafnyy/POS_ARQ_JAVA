package br.edu.infnet.gerenciador.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.gerenciador.model.domain.Produto;
import br.edu.infnet.gerenciador.model.domain.Usuario;
import br.edu.infnet.gerenciador.model.repository.IProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private IProdutoRepository repository;
	
	public Collection<Produto> obterLista(Usuario usuario) {
		return (Collection<Produto>) repository.findAll(usuario.getId(),
				Sort.by(Sort.Direction.ASC, "nome")
				);
	}
	
	public void incluir(Produto produto) {
		repository.save(produto);
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
	
}
