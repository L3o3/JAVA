package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcelas;
import services.ServicoContrato;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double valorTotal = sc.nextDouble();
		
		Contrato obj = new Contrato(numero, data, valorTotal);
		
		System.out.println("Entre com o número de parcelas: ");
		int n = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(null);
		
		servicoContrato.processaContrato(obj, n);
		
		System.out.println("Parcela: ");
		for (Parcelas parcelas : obj.getParcelas()) {
			System.out.println(parcelas);
		}
		
		
		
		sc.close();
	}

}
