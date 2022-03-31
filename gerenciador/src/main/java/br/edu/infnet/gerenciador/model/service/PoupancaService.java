package br.edu.infnet.gerenciador.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.gerenciador.model.domain.Poupanca;

@Service
public class PoupancaService {
	
	private static Map<Integer, Poupanca> map = new HashMap<Integer, Poupanca>();
	private static Integer id = 1;

	public Collection<Poupanca> obterLista() {
		return map.values();
	}
	
	public void incluir(Poupanca poupanca) {
		poupanca.setId(id++);
		map.put(poupanca.getId(), poupanca);
	}
	
	public void excluir(Integer id) {
		map.remove(id);
	}
	
	public Poupanca obterPorId(Integer id) {
		return map.get(id);
	}
}
