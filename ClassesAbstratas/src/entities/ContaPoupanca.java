package entities;

public class ContaPoupanca extends Conta{

	private Double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer conta, String titular, Double saldo, Double taxaJuros) {
		super(conta, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizaSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public final void saque(Double Saldo) {
		saldo -= Saldo;
	}
	
}