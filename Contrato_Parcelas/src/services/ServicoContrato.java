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
		double quotaBasica = contrato.getValorTotal() / meses;
        	for (int i = 1; i <= meses; i++) {
        		 LocalDate vencimento = contrato.getData().plusMonths(i);
                 double juros = servicoPagamentoOnline.juros(quotaBasica, i);
                 double taxa = servicoPagamentoOnline.taxaPagamento(quotaBasica + juros);
                 double quota = quotaBasica + juros + taxa;
                 contrato.getParcelas().add(new Parcelas(vencimento, quota));
             }
	}
}
