package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

/**
 * CLASSE EXECUTÁVEL
 * @author leand
 *
 */
public class Executavel {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		for(int quantidade = 1; quantidade <= 3; quantidade++) {
		
			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno? ");
	//		String idade = JOptionPane.showInputDialog("Qual a idade do Aluno? ");
	//		String dataNasc = JOptionPane.showInputDialog("Qual a data nascimento do Aluno? ");
	//		String cpf = JOptionPane.showInputDialog("Qual o CPF do Aluno? ");
	//		String rg = JOptionPane.showInputDialog("Qual o RG do Aluno? ");
	//		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do Aluno? ");
	//		String nomePai = JOptionPane.showInputDialog("Qual o nome pai do Aluno? ");
	//		String dataMatric = JOptionPane.showInputDialog("Qual a data matricula do Aluno? ");
	//		String serieMatric = JOptionPane.showInputDialog("Qual a série do Aluno? ");
	//		String nomeEsc = JOptionPane.showInputDialog("Qual o nome da escola do Aluno? ");
			
			//setando os dados os dados no objeto aluno
			Aluno aluno = new Aluno();
			aluno.setNome(nome.toUpperCase());
	//		aluno.setIdade(Integer.valueOf(idade));
	//		aluno.setDataNascimento(dataNasc);
	//		aluno.setNumeroCpf(cpf);
	//		aluno.setRegistroGeral(rg);
	//		aluno.setNomeMae(nomeMae.toUpperCase());
	//		aluno.setNomePai(nomePai.toUpperCase());
	//		aluno.setDataMatricula(dataMatric);
	//		aluno.setSerieMatriculado(serieMatric);
	//		aluno.setNomeEscola(nomeEsc.toUpperCase());
			
	
			for (int i = 1; i <= 4; i++) {
				String disciplina = JOptionPane.showInputDialog("Disciplina "+ i +" ? " );
				String nota = JOptionPane.showInputDialog("Nota ? ");
				Disciplina disc = new Disciplina();
				disc.setNomeDisciplina(disciplina);
				disc.setNota(Double.valueOf(nota));
				//ADICIONA AS DISCIPLINAS E NOTAS NA LISTA
				aluno.getDisciplinas().add(disc);
			}
			
			
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			if (escolha == 0) {//OPÇÃO SIM = 0
				
				//WHILE -> ENQUANTO FOR VERDADEIRO FAÇA
				//LÓGICA DO CÓDIGO
				int continuarRemover = 0;
				int posicao = 1;
				
				while(continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover disciplinas?");
				}
			}
		
			alunos.add(aluno);//Adiciona os dados do aluno na lista
		}
		
		/*Percorre a lista de alunos | Para cada aluno iimprime os dados do aluno*/
		for(Aluno aluno : alunos) {
			
			/*Procurando um aluno e imprimindo a média*/
			if(aluno.getNome().equalsIgnoreCase("José")) {
				
				alunos.remove(aluno);/*REMOVE UM ALUNO DA LISTA, NO CASO O ALUNO JOSÉ*/
				break;//parar o código assim que encontrar o aluno 'josé'
			} else {
				System.out.println(aluno.toString());
				System.out.println("Média :: " + String.format("%.2f", aluno.getMediaNota()));
				System.out.println("Resultado :: " + aluno.getAlunoAprovado2());
				System.out.println("----------------------------------------------------------------------------------");
			}
		}
		
		/*ESSE FOR PERCORRE OS ALUNO QUE SOBRARAM NA LISTA*/
		System.out.println();
		System.out.println("Alunos que sobraram na lista ::: ");
		for (Aluno aluno : alunos) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("NOME DO ALUNO :: " + aluno.getNome());
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Suas matérias são :::");
			System.out.println();
			
			for(Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println("--------------------------------------------------------------");
				System.out.println("Nome :: " + disciplina.getNomeDisciplina() + " - Nota :: " + disciplina.getNota());
				System.out.println("================================================================================");
			}
		}
		
	}
}
