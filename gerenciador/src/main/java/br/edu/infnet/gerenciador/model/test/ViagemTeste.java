package br.edu.infnet.gerenciador.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.gerenciador.model.domain.Viagem;

public class ViagemTeste {

	public static void main(String[] args) {
		Viagem v1 = new Viagem("Viagem para Machu Pichu", 10000, "Nubank");
		v1.setDataViagem(LocalDateTime.of(2023, 07, 01, 0, 0));
		v1.setInternacional(true);
		v1.setQtdAcompanhantes(1);
		
		System.out.println(v1);
		
		Viagem v2 = new Viagem("Viagem para Maceio", 5000, "Itau");
		v2.setDataViagem(LocalDateTime.of(2022, 03, 15, 0, 0));
		v2.setInternacional(false);
		v2.setQtdAcompanhantes(2);
		
		System.out.println(v2);
	}
}
