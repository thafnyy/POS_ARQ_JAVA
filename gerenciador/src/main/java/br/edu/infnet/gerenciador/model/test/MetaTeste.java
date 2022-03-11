package br.edu.infnet.gerenciador.model.test;

import br.edu.infnet.gerenciador.model.domain.Meta;
import br.edu.infnet.gerenciador.model.domain.Poupanca;
import br.edu.infnet.gerenciador.model.domain.Produto;
import br.edu.infnet.gerenciador.model.domain.Viagem;

public class MetaTeste {

	public static void main(String[] args) {
		Meta m1 = new Poupanca("Faculdade", 89000f, "Itau");

		Meta m2 = new Viagem("Londres", 25000, "XP");

		Meta m3 = new Produto("Casa na Praia", 50000, "XP");
		
	}

}
