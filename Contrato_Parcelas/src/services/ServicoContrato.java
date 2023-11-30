package services;

import java.util.Calendar;
import java.util.Date;

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
            Date data = addMeses(contrato.getData(), i);
            double atualizaQuota = quotaBasica + servicoPagamentoOnline.juros(quotaBasica, i);
            double quotaTotal =  atualizaQuota + servicoPagamentoOnline.taxaPagamento(atualizaQuota);
            contrato.addParcelas(new Parcelas(data, quotaTotal));
        }
	}
        
        private Date addMeses(Date data, int n) {
    		Calendar cal = Calendar.getInstance();
    		cal.setTime(data);	
    		cal.add(Calendar.MONTH, n);
    		return cal.getTime();
	}
}
