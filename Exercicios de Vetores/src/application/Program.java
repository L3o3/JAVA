package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declaração e instaciação do vetor;
		System.out.println("Quantas alturas vai calcular?");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		//Percorre o 'for' e armazena os valores em cada bloco;
		for (int i = 0; i < n; i++) {
			System.out.print("Altura " +(i + 1) + ": ");
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		//Soma os valores de cada bloco do vetor.
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		System.out.printf("Altura média: %.2fm", avg);
		sc.close();
	}
}