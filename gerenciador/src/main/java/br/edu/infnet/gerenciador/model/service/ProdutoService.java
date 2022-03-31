package br.edu.infnet.gerenciador.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.gerenciador.model.domain.Produto;

@Service
public class ProdutoService {
	
	private static Map<Integer, Produto> map = new HashMap<Integer, Produto>();
	private static Integer id = 1;

	public Collection<Produto> obterLista() {
		return map.values();
	}
	
	public void incluir(Produto produto) {
		produto.setId(id++);
		map.put(produto.getId(), produto);
	}
	
	public void excluir(Integer id) {
		map.remove(id);
	}
	
	public Produto obterPorId(Integer id) {
		return map.get(id);
	}
}
