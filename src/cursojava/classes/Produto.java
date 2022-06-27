package cursojava.classes;

public class Produto {
	
	private String descricao;
	private Double valor;
	private Integer quantidade;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public double imposto(double valorImposto) {
		double valorImpos = 0.0;
		valorImpos = (this.valor * valorImposto) / 100;
		return this.valor += valorImpos;
	}
	
}
