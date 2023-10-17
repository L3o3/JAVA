package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String name;
		int nota1, nota2, nota3;
		
		System.out.println("Nome do aluno?");
		name = sc.next();
		System.out.println("Nota 1?");
		nota1 = sc.nextInt();
		System.out.println("Nota 2?");
		nota2 = sc.nextInt();
		System.out.println("Nota 3?");
		nota3 = sc.nextInt();

		int total = nota1 + nota2 + nota3;
		
		if (total >= 60) {
			System.out.println("Nota final: " + total);
			System.out.println("Passou");
		}
		else {
			System.out.println("Nota final: " + total);
			System.out.println("Reprovou");
			int falta = 60 - total;
			System.out.printf("Faltou %d pontos", falta);
		}
		
		
		
		sc.close();
	}

}
