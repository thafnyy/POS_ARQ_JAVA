package br.edu.infnet.gerenciador.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.gerenciador.model.domain.Viagem;

@Service
public class ViagemService {
	
	private static Map<Integer, Viagem> map = new HashMap<Integer, Viagem>();
	private static Integer id = 1;

	public Collection<Viagem> obterLista() {
		return map.values();
	}
	
	public void incluir(Viagem viagem) {
		viagem.setId(id++);
		map.put(viagem.getId(), viagem);
	}
	
	public void excluir(Integer id) {
		map.remove(id);
	}
	
	public Viagem obterPorId(Integer id) {
		return map.get(id);
	}
}
