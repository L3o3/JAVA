package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Formas;
import entities.Retangulo;
import entities.Circulo;
import entities.enums.Cores;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Formas> lista = new ArrayList<>();
		
		System.out.print("Entra com a quantidade de formas: ");
		int quant = sc.nextInt();
		
		for (int i=1; i<=quant; i++) {
			System.out.println("Dados da forma #" + i);
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Cores cor = Cores.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				lista.add(new Retangulo(cor, largura, altura));
			}
			else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println();
		System.out.println("Area da forma:");
		for (Formas forma : lista) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		sc.close();
	}
}