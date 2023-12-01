package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {

	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate vencimento;
	private Double quantidade;

	public Parcelas(LocalDate vencimento, Double quantidade) {
		this.vencimento = vencimento;
		this.quantidade = quantidade;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate data) {
		this.vencimento = data;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return vencimento.format(fmt) + " - " + String.format("%.2f", quantidade);
	}
	
	
	
	
	
	
}
