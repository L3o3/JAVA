package entities;

public class FuncionarioTerceirizado extends Funcionario{

	private Double TaxaExtra;
	
	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorHora, Double taxaExtra) {
		super(nome, horas, valorHora);
		this.TaxaExtra = taxaExtra;
	}

	public Double getTaxaExtra() {
		return TaxaExtra;
	}

	public void setTaxaExtra(Double taxaExtra) {
		this.TaxaExtra = taxaExtra;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + TaxaExtra * 1.1;
	}
	
}
