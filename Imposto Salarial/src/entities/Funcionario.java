package entities;

public class Funcionario {

	String nome;
	double salarioBruto;
	double imposto;
	
	public double SalarioLiquido() {
		return (salarioBruto - imposto);
	}
	
	public double AumentoSalario(double porcentagem) {
		return ((salarioBruto * porcentagem / 100) + SalarioLiquido());
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
        this.nome = nome;
    }
	
	public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double SalarioBruto) {
        this.salarioBruto = SalarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
