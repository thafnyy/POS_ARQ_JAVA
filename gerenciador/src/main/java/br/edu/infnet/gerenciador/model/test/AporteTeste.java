package br.edu.infnet.gerenciador.model.test;

import java.time.LocalDateTime;
import java.util.Arrays;

import br.edu.infnet.gerenciador.model.domain.Aporte;
import br.edu.infnet.gerenciador.model.domain.Investidor;
import br.edu.infnet.gerenciador.model.domain.Viagem;

public class AporteTeste {

	public static void main(String[] args) {
		
		Viagem v1 = new Viagem("Viagem para Machu Pichu", 10000, "Nubank");
		v1.setDataViagem(LocalDateTime.of(2023, 07, 01, 0, 0));
		v1.setInternacional(true);
		v1.setQtdAcompanhantes(1);
		
		Viagem v2 = new Viagem("Viagem para Maceio", 5000, "Itau");
		v2.setDataViagem(LocalDateTime.of(2022, 03, 15, 0, 0));
		v2.setInternacional(false);
		v2.setQtdAcompanhantes(2);
		
		Aporte aporte = new Aporte();
		aporte.setValorAporte(15f);
		aporte.setInvestidor(new Investidor("thafny", "thafny@teste.com", 27));
		aporte.setMetas(Arrays.asList(v1, v2));
		
		System.out.println(aporte);
	}
}
