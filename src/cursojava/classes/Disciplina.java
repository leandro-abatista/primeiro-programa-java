package cursojava.classes;

/*
 * ESSA CLASSE DISCIPLINA SERVIRÁ PARA OS OBJETOS E INSTANCIAS DOS ATRIBUTOS NOMEDISCIPLINA E NOTAS*/
public class Disciplina {

	private String nomeDisciplina;
	private double nota;

	public Disciplina() {
		// TODO Auto-generated constructor stub
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return " "
				+ "\n nome da Disciplina = " + nomeDisciplina 
				+ ", nota=" + nota;
	}
	
	

}
