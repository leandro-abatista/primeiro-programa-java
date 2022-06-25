package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*EST� CLASSE/OBJETO QUE REPRESENTA ALUNO*/
public class Aluno {

	// Atributos da classe aluno
	// Por padr�o os atributos em java s�o private
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	//INSTANCIANDO A LISTA DE DISCIPLINAS E NOTAS
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	
	// Contrutor � a forma de criar uma inst�ncia do objeto na mem�ria
	// Existe dois tipos de contrutores
	// Contrutor com argumentos e o construtor sem argumentos

	public Aluno() {
		/* Construtor vazio */
		/*
		 * Cria os dados na mem�ria, sendo esse construtor � padr�o do java, mesmo que
		 * n�o seja declarado
		 */
	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao, String dataNascimentoPadrao) {
		this.nome = nomePadrao;
		this.idade = idadePadrao;
		this.dataNascimento = dataNascimentoPadrao;
	}

	/* APRENDENDO SOBRE OS M�TODOS GETTERS E SETTERS DO OBJETO */
	/* SETTERS RECEBE OS DADOS DO ATRIBUTO */
	/*
	 * GETTERS � PARA PEGAR/RECUPERAR/RESGATAR/OBTER OS DADOS DOS ATRIBUTOS DO
	 * OBJETO
	 */
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	/**
	 * M�todo para retornar a m�dia do aluno
	 */
	public double getMediaNota() {
		
		double somaNotas = 0.0;//inicia com 0
		//varrendo/percorrendo a lista de disciplinas
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		//return somaNotas / 4;//pode ser assim ou pode
		return somaNotas / disciplinas.size();//size retorna a quantidade de objetos na disciplina - assim fica din�mico
	} 
	
	/*M�TODO QUE REORNA TRUE APROVADO E FALSE PARA REPROVADO*/
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * M�todo para verificar se o aluno est� aprovado, em recupera��o, reprovado
	 * @return
	 */
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return "Aluno est� aprovado";
			} else {
				return "Aluno est� em recupera��o";
			}
		} else {
			return "Aluno est� reprovado";
		}
	}

	@Override
	public String toString() {
		return "Aluno "
				+ "[nome = " + nome 
				+ "\n, idade = " + idade 
				+ "\n, data Nascimento = " + dataNascimento 
				+ "\n, registro Geral = " + registroGeral 
				+ "\n, cpf = " + numeroCpf 
				+ "\n, nome da Mae = " + nomeMae 
				+ "\n, nome do Pai = " + nomePai
				+ "\n, data Matricula = " + dataMatricula 
				+ "\n, nome da Escola = " + nomeEscola 
				+ "\n, serie Matriculado = " + serieMatriculado
				+ "\n, Disciplinas = " + disciplinas 
				+ "]";
	}

	
}
