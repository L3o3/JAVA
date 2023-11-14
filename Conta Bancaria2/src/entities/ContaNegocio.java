package entities;

public class ContaNegocio extends Conta {

	private Double limiteCredito;

 
	public ContaNegocio() {
		super();
	}

	public ContaNegocio(Integer conta, String titular, Double saldo, Double limiteCredito) {
		super(conta, titular, saldo);
		this.limiteCredito = limiteCredito;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public void emprestimo(Double Saldo) {
		if (Saldo <= limiteCredito) {
			saldo += Saldo - 10.0;
		}
	}
	
	@Override
	public void saque(Double Saldo) {
		super.saque(Saldo);
		saldo -= 2.0;
	}
	
}	
	
	