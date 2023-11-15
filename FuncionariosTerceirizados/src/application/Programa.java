package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de funcionários: ");
		int quant = sc.nextInt();
		
		for (int i=1; i<= quant; i++) {
			System.out.println("Dados do Funcionário #" + i);
			System.out.print("É terceirizado?(s/n): ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			if (ch == 's') {
				System.out.print("Taxa Extra: ");
				double taxaExtra = sc.nextDouble();
				lista.add(new FuncionarioTerceirizado(nome, horas, valorHora, taxaExtra));
			} else {
				lista.add(new Funcionario(nome, horas, valorHora));
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTO");
		for (Funcionario func : lista) {
			System.out.println(func.getNome() + " - R$" + String.format("%.2f", func.pagamento()));
		}
		
		sc.close();
	}

}
