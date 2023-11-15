package entities;

public class ProdutoImportado extends Produto {

	private Double taxaCustomizada;
	
	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, Double preco, Double taxaCustomizada) {
		super(nome, preco);
		this.taxaCustomizada = taxaCustomizada;
	}

	public Double getTaxaCustomizada() {
		return taxaCustomizada;
	}

	public void setTaxaCustomizada(Double taxaCustomizada) {
		this.taxaCustomizada = taxaCustomizada;
	}
	
	public Double precoTotal() {
		return getPreco() + taxaCustomizada;
	}
	
	@Override
	public String tagPreco() {
		return getNome() 
				+ " R$ " 
				+ String.format("%.2f", precoTotal())
				+ " (Taxa customizada: R$ " 
				+ String.format("%.2f", taxaCustomizada)
				+ ")";
	}
	
}
