package entities;

public class Produto {

	public String nome;
	public double preço;
	public int quantidade;
	
	public double valorTotalNoEstoque() {
		return preço * quantidade;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome 
				+ ", R$" 
				//Para por num formato de 2 casa decimais, use 'String.format("%.2f", variavel)'
				+ String.format("%.2f", preço) 
				+ ", "
				+ quantidade
				+ " unidades, Total: R$"
				//Para por num formato de 2 casa decimais, use 'String.format("%.2f", variavel)'
				+ String.format("%.2f", valorTotalNoEstoque());
					
	}
}
