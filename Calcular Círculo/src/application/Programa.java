package application;

import java.util.Locale;
import java.util.Scanner;

import calculator.Circulo;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Circulo circ = new Circulo();
		
		System.out.println("Qual o valor do Raio?");
		double raio = sc.nextDouble();
		circ.setRaio(raio);
		
		double circun = circ.calcularCircunferencia();
		double vol = circ.calcularVolume();
		double pi = circ.PI();
		
		System.out.printf("Circunferência: %.2f%n", circun);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("Valor do PI: %.2f", pi);

		
		sc.close();
	}
}