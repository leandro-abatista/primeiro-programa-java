package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Produto;

public class ExecutavelProduto {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		
		for (int quant = 0; quant < 2; quant++) {

			String descricao = JOptionPane.showInputDialog("Informe a descrição do produto?");
			String valor = JOptionPane.showInputDialog("Informe o valor do produto?");
			String quantidade = JOptionPane.showInputDialog("Informe a quantidade do produto?");

			Produto produto = new Produto();
			produto.setDescricao(descricao);
			produto.setValor(Double.valueOf(valor));
			produto.setQuantidade(Integer.valueOf(quantidade));
			
			int temImposto = JOptionPane.showConfirmDialog(null, "Tem imposto de entrada?");
			if (temImposto == 0) {
				
				String valorIm = JOptionPane.showInputDialog("Qual o valor?");
				produto.imposto(Double.valueOf(valorIm));
			}

			produtos.add(produto);
		}
		
		
		
		System.out.println("---------Produtos Cadastrados--------------------");
		for (Produto produto : produtos) {
			System.out.println("---------------------------------------------");
			System.out.println("Descrição :: " + produto.getDescricao());
			System.out.println("Valor :: " + String.format("%.2f", produto.getValor()));
			System.out.println("Quantidade :: " + produto.getQuantidade());
			System.out.println("---------------------------------------------");
		}
		

	}

}
