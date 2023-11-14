package application;

import entities.Conta;
import entities.ContaNegocio;
import entities.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {

		Conta cont = new Conta(1001, "Leoe", 1000.0);
		cont.saque(200.0);
		System.out.println(cont.getSaldo());
		
		Conta cont1 = new ContaPoupanca(1002, "José", 3000.0, 0.01);
		cont1.saque(300.0);
		System.out.println(cont1.getSaldo());
		
		Conta cont2 = new ContaNegocio(1003, "Bete", 500.0, 700.0);
		cont2.saque(200.0);
		System.out.println(cont2.getSaldo());
		
		
	}
}
