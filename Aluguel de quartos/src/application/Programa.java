package application;

import java.text.ParseException;
import java.util.Scanner;

import entities.Aluguel;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in); 
		
		Aluguel[] hospede = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Hospede #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int numeroQuarto = sc.nextInt();
			hospede[numeroQuarto] = new Aluguel(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i=0; i<10; i++) {
			if (hospede[i] != null) {				
				System.out.println(i + ": " + hospede[i]);
			}
		}
		sc.close();
	}

}

