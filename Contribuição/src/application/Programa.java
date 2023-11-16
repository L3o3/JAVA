package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empresarial;
import entities.Individual;
import entities.Contribuinte;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do contribuinte #" + i + ":");
			System.out.print("Individual ou Empresarial (i/e)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			if (tipo == 'i') {
				System.out.print("Despesas de saúde: ");
				double despesaSaude = sc.nextDouble();
				lista.add(new Individual(nome, renda, despesaSaude));
			}
			else {
				System.out.print("Número de funcionários: ");
				int numeroDeFuncionario = sc.nextInt();
				lista.add(new Empresarial(nome, renda, numeroDeFuncionario));
			}
		}

		double soma = 0.0;
		System.out.println();
		System.out.println("Imposto pago: ");
		for (Contribuinte cont : lista) {
			double taxa = cont.taxa();
			System.out.println(cont.getNome() + ": R$ " + String.format("%.2f", taxa));
			soma += taxa;
		}
		
		System.out.println();
		System.out.println("IMPOSTO TOTAL: R$ " + String.format("%.2f", soma));
		
		sc.close();
	}
}
