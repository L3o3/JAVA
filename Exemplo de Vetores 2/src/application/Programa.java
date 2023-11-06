package application;
class application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Programa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		
		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double avg = soma / vetor.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}
}