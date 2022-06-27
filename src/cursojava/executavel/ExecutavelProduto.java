package cursojava.executavel;

import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Produto;

public class ExecutavelProduto {

	public static void main(String[] args) {
		
		String descricao = JOptionPane.showInputDialog("Informe a descrição do produto?");
		String valor = JOptionPane.showInputDialog("Informe o valor do produto?");
		String quantidade = JOptionPane.showInputDialog("Informe a quantidade do produto?");

		Produto produto = new Produto();
		produto.setDescricao(descricao);
		produto.setValor(Double.valueOf(valor));
		produto.setQuantidade(Integer.valueOf(quantidade));
		
		System.out.println();
		System.out.println("Descrição :: " + produto.getDescricao());
		System.out.println("Valor :: " + produto.getValor());
		System.out.println("Quantidade :: " + produto.getQuantidade());
		
		
	}

}
