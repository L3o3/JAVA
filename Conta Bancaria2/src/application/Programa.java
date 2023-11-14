package application;

import entities.Conta;
import entities.ContaNegocio;
import entities.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {

		Conta cont = new Conta(1001, "Leoe", 0.0);
		ContaNegocio contN = new ContaNegocio(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Conta cont1 = contN;
		Conta cont2 = new ContaNegocio(1003, "Antônio", 0.0, 200.0);
		Conta cont3 = new ContaPoupanca(1004, "João" , 0.0, 300.0);
		
		//DOWNCAST
		
		ContaNegocio cont4 = (ContaNegocio)cont2;
		cont4.emprestimo(100.0);
		
		//ContaNegocio cont5 = (ContaNegocio)cont3;
		if (cont3 instanceof ContaNegocio) {
			ContaNegocio cont5 = (ContaNegocio)cont3;
			cont5.emprestimo(5000.0);
			System.out.println("Emprestimo");
		}
		
		if (cont3 instanceof ContaPoupanca) {
			ContaPoupanca cont5 = (ContaPoupanca)cont3;
			cont5.atualizaSaldo();
			System.out.println("Saldo atualizado");
		}
	}

}
