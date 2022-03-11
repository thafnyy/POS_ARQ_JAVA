package br.edu.infnet.gerenciador.model.test;

import br.edu.infnet.gerenciador.model.domain.Produto;
import br.edu.infnet.gerenciador.util.TipoProdutoConstante;

public class ProdutoTeste {
	
	public static void main(String[] args) {

		Produto p = new Produto("Notebook", 8000f, "Itau");
		p.setEntrada(false);
		p.setMarca("Dell");
		p.setTipoProduto(TipoProdutoConstante.ELETRONICO);
		
		System.out.println(p);
		
		Produto p1 = new Produto("Carro", 13000f, "Rico");
		p1.setEntrada(true);
		p1.setMarca("Fiat");
		p1.setTipoProduto(TipoProdutoConstante.CARRO);
		
		System.out.println(p1);
		
		Produto p2 = new Produto("iPhone 13 Pro Max 1tb", 18000f, "Banco Inter");
		p2.setEntrada(false);
		p2.setMarca("Apple");
		p2.setTipoProduto(TipoProdutoConstante.ELETRONICO);
		
		System.out.println(p2);
	}
}
