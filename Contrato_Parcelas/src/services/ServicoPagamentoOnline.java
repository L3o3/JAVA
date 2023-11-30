package services;

public interface ServicoPagamentoOnline {

	double taxaPagamento(double saldo);
	double juros(double saldo, int meses);
	
}
