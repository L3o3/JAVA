package model.services;

public class TaxaServicoBrasil implements TaxaServico{

	public double taxa(double saldo) {
		if (saldo <= 100.00) {
			return saldo * 0.2;
		}
		else {
			return saldo * 0.15;
		}
	}
	
}
