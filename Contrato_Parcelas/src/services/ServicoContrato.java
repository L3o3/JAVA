package services;

import java.time.LocalDate;

import entities.Contrato;
import entities.Parcelas;

public class ServicoContrato {

	private ServicoPagamentoOnline servicoPagamentoOnline;

	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void processaContrato(Contrato contrato, int meses) {
		contrato.getParcelas().add(new Parcelas(LocalDate.of(2018, 7, 25), 206.04));
		contrato.getParcelas().add(new Parcelas(LocalDate.of(2018, 8, 25), 206.04));

	}
	
	
}
