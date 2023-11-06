package operation;

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
		deposito(depositoInicial);
	}
	public int getNumConta() {
		return numConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
				+ ", Deposito: R$"
				+ String.format("%.2f.",depositoInicial);
	}
}