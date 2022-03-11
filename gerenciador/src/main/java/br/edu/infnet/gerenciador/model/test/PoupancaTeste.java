package br.edu.infnet.gerenciador.model.test;

import br.edu.infnet.gerenciador.model.domain.Poupanca;
import br.edu.infnet.gerenciador.model.domain.Prazo;

public class PoupancaTeste {
	public static void main(String[] args) {
		Poupanca p = new Poupanca("Aposentadoria", 500000f, "Itau");
		p.setLiquidezDiaria(false);
		p.setPctRendaAnual(9.0f);
		p.setPrazo(Prazo.LONGO);
		
		System.out.println(p);
		
		Poupanca p1 = new Poupanca("Reserva Emergencia", 43000f, "XP Inv.");
		p1.setLiquidezDiaria(true);
		p1.setPctRendaAnual(5.2f);
		p1.setPrazo(Prazo.CURTO);
		
		System.out.println(p1);
	}
}
