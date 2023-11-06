package entities;

public class Conta {

	private int numConta;
	private String nome;
	private double depositoInicial;
		
	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	public Conta(int numConta, String nome, double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		this.depositoInicial = depositoInicial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}
	
	public void deposito(double saldo) {
		depositoInicial += saldo;
	}
	
	public void saque(double saldo) {
		depositoInicial -= saldo + 5.00;
	}
	
	public String toString() {
		return "Conta "
				+ numConta 
				+ ", Nome: "
				+ nome 
				+ ", Saldo: R$"
				+ String.format("%.2f", depositoInicial);
	}
}
