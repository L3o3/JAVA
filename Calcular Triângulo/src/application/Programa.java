package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triângulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triângulo x, y;
		x = new Triângulo();
		y = new Triângulo();
		
		System.out.println("Entre com as medidas do Triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do Triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();		
		double areaY = y.area();
		
		System.out.printf("Triângulo X, área: %.4f%n", areaX);
		System.out.printf("Triângulo Y, área: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.printf("X tem a maior área.");
		} 
		else {
			System.out.printf("Y tem a maior área.");
		}

		sc.close();
	}

}
