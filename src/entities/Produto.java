package entities;

//Para usar o comparable devemos extender de Comparable
public class Produto implements Comparable <Produto>{
	
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "\nProduto: " + nome + "- Preço R$: " + String.format("%.2f", preco);
	}

	//Método implementado que sobrescreve o padrão dizem a base no que compara
	@Override
	public int compareTo(Produto outro) {
		return preco.compareTo(outro.getPreco());
	}


	
	
	

}
