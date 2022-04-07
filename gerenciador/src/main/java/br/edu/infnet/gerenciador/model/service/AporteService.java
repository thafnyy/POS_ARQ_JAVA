package br.edu.infnet.gerenciador.model.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.gerenciador.model.domain.Aporte;

@Service
public class AporteService {
	
	private static Map<Integer, Aporte> map = new HashMap<Integer, Aporte>();
	private static Integer id = 1;

	public Collection<Aporte> obterLista() {
		return map.values();
	}
	
	public void incluir(Aporte aporte) {
		aporte.setId(id++);
		aporte.setData(LocalDateTime.now());
		map.put(aporte.getId(), aporte);
	}
	
	public void excluir(Integer id) {
		map.remove(id);
	}
	
	public Aporte obterPorId(Integer id) {
		return map.get(id);
	}
}
