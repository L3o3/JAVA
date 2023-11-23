package model.services;

import java.time.Duration;

import model.entities.AluguelCarro;
import model.entities.Fatura;

public class ServicoAluguel {

	private Double precoHora;
	private Double precoDia;
	
	private TaxaServico taxaServico;
	
	public ServicoAluguel() {
	}

	public ServicoAluguel(Double precoHora, Double precoDia, TaxaServico taxaServico) {
		this.precoHora = precoHora;
		this.precoDia = precoDia;
		this.taxaServico = taxaServico;
	}
	
	public void ProcessaFatura(AluguelCarro aluguelCarro) {
		double minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();
		double horas = minutos / 60.0;
		
		double pagamentoBasico;
		if (horas <= 12.0) {
			pagamentoBasico = precoHora * Math.ceil(horas);
		}
		else {
			pagamentoBasico = precoDia * Math.ceil(horas/24.0);
		}
		
		double taxa = taxaServico.taxa(pagamentoBasico);
		
		aluguelCarro.setFatura(new Fatura(pagamentoBasico, taxa));
	}
	
	
	
}
