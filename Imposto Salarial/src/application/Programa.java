package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salarioBruto;
		double imposto;
		double porcentagem;
		
		Funcionario func = new Funcionario();
		System.out.println("Nome: ");
		nome = sc.nextLine();
		System.out.println("Salário Bruto: ");
		salarioBruto = sc.nextDouble();
		System.out.println("Imposto: ");
		imposto = sc.nextDouble();
		
		func.setNome(nome);
		func.setSalarioBruto(salarioBruto);
		func.setImposto(imposto);
		
		System.out.println("Funcionário: " + func.getNome() + ", R$ " + func.SalarioLiquido());
		System.out.println("Qual a porcentagem de aumento de salário? ");
		porcentagem = sc.nextDouble();
		func.AumentoSalario(porcentagem);
		System.out.println("Dados atualizados: " + func.getNome() + ", R$ " + func.AumentoSalario(porcentagem));
		
		sc.close();
	}
}
