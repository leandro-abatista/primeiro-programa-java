package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Produto;

public class ExecutavelProduto {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		
		for (int quant = 1; quant < 3; quant++) {

			String descricao = JOptionPane.showInputDialog("Informe a descri��o do produto "+quant+"?");
			String valor = JOptionPane.showInputDialog("Informe o valor do produto?");
			String quantidade = JOptionPane.showInputDialog("Informe a quantidade do produto?");

			Produto produto = new Produto();
			produto.setDescricao(descricao);
			produto.setValor(Double.valueOf(valor));
			produto.setQuantidade(Integer.valueOf(quantidade));
			
			int temImposto = JOptionPane.showConfirmDialog(null, "Tem imposto de entrada?");
			if (temImposto == 0) {// 0 QUER DIZER SIM
				
				//SE TIVER IMPOSTO, VAI PEDIR O VALOR
				String valorIm = JOptionPane.showInputDialog("Qual o valor?");
				produto.imposto(Double.valueOf(valorIm));
			}

			produtos.add(produto);
		}
		
		//PERCORRENDO A LISTA E RECUPERANDO OBJETO PELA POSI��O
		for(int pos = 0; pos < produtos.size(); pos++) {
			Produto p = produtos.get(pos);
			System.out.println("Produto :: " + pos);
			System.out.println("---------------------------------------------");
			System.out.println("Descri��o :: " + p.getDescricao());
			System.out.println("Valor :: " + String.format("%.2f", p.getValor()));
			System.out.println("Quantidade :: " + p.getQuantidade());
			System.out.println("---------------------------------------------");
		}
		
		
		
//		System.out.println("---------Produtos Cadastrados--------------------");
//		for (Produto produto : produtos) {
//			System.out.println("---------------------------------------------");
//			System.out.println("Descri��o :: " + produto.getDescricao());
//			System.out.println("Valor :: " + String.format("%.2f", produto.getValor()));
//			System.out.println("Quantidade :: " + produto.getQuantidade());
//			System.out.println("---------------------------------------------");
//		}
		

	}

}
