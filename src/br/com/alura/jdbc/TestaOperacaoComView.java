package br.com.alura.jdbc;

import javax.swing.JFrame;

import br.com.alura.jdbc.view.ProdutoCategoriaFrame;

public class TestaOperacaoComView {

	public static void main(String[] args) {
		ProdutoCategoriaFrame produtoCategoriaFrame = new ProdutoCategoriaFrame();
		produtoCategoriaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

//Ao rodar este arquivo, você visualizará a tabela com todos os produtos cadastrados
//podendo fazer todas as operações CRUD