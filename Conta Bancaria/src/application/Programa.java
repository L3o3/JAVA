package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta conta;
		
		System.out.print("Entre com o número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Entre com o nome do titular da conta:");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja fazer algum depósito inicial (S/N)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Entre com o valor do depósito inicial: ");			 
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numConta, nome, depositoInicial);
			}
		
		else {
			conta = new Conta(numConta, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados da conta atualizado");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados da conta atualizado");
		System.out.println(conta);
		
		sc.close();
	}

}
