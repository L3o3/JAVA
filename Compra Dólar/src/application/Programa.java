package application;

import java.util.Locale;
import java.util.Scanner;

import calculator.ConversorMoeda;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ConversorMoeda cm = new ConversorMoeda();
		
		System.out.println("Qual o valor do Dolar?");
		double cotacao = sc.nextDouble();
		System.out.println("Quantos dolares quer comprar?");
		double quantidade = sc.nextDouble();
		
		double conversao = cm.conversao(cotacao, quantidade);
		
		System.out.printf("Essa valor em Reais é: R$%.2f%n", conversao);
		
		
		sc.close();
	}

}
