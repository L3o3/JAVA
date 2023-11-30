package services;

public class ServicoPaypal implements ServicoPagamentoOnline {

	private static final double TAXA_PAGAMENTO = 0.02;
	private static final double JUROS_MENSAIS = 0.01;

	@Override
	public double taxaPagamento(double saldo) {
		return saldo * TAXA_PAGAMENTO;
	}

	@Override
	public double juros(double saldo, int meses) {
		return saldo * JUROS_MENSAIS * meses;
	}
}
	

