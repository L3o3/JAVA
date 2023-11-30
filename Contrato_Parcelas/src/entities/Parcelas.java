package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	private Date data;
	private Double quantidade;

	public Parcelas(Date data, Double quantidade) {
		this.data = data;
		this.quantidade = quantidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return sdf.format(data) + " - " + String.format("%.2f", quantidade);
	}
	
	
	
	
	
	
}
