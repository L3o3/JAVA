package application;

import java.util.Locale;
import java.util.Scanner;

import util.Retângulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retângulo retangulo = new Retângulo();
		
		System.out.println("Entre com a Altura e Largura do Retangulo:");
		System.out.println("Altura: ");
		retangulo.Altura = sc.nextDouble();
		System.out.println("Largura: ");
		retangulo.Largura = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", retangulo.Area());
		System.out.printf("PERIMETRO: %.2f%n", retangulo.Perimetro());
		System.out.printf("DIAGONAL: %.2f%n", retangulo.Diagonal());

		sc.close();
	}
}
