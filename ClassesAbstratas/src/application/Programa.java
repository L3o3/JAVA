package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Conta;
import entities.ContaNegocio;
import entities.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Conta> lista = new ArrayList<>();
		
		lista.add(new ContaPoupanca(1001, "Alex", 500.00, 0.01));
		lista.add(new ContaNegocio(1002, "Maria", 1000.0, 400.0));
		lista.add(new ContaPoupanca(1004, "Bob", 300.0, 0.01));
		lista.add(new ContaNegocio(1005, "Anna", 500.0, 500.0));
		
		double soma = 0.0;
		for (Conta conta : lista) {
			soma += conta.getSaldo();
		}
		
		System.out.printf("Saldo total: %.2f%n", soma);
		
		for (Conta conta : lista) {
			conta.deposit(10.0);
		}
		for (Conta conta : lista) {
			System.out.printf("Atualização do saldo da Conta %d: %.2f%n", conta.getConta(), conta.getSaldo());
		}
	}
}