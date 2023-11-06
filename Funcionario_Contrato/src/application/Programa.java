package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraPorContrato;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador:");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nivel: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Salário base: ");
		Double baseSalarial = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), baseSalarial, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos para esse trabalhador: ");
		int QuantidadeContrato = sc.nextInt();
			for (int i = 1; i <= QuantidadeContrato; i ++) {
				System.out.print("Entre com #" + i +" dado: ");
				System.out.print("Data (DD/MM/AAAA): ");
				Date dataContrato = sdf.parse(sc.next());
				System.out.print("Valor por Hora: ");
				Double valorPorHora = sc.nextDouble();
				System.out.print("Duração(horas): ");
				int horas = sc.nextInt();
				HoraPorContrato contrato = new HoraPorContrato(dataContrato, valorPorHora, horas);
				trabalhador.adicionaContrato(contrato);
			}
			
		System.out.println();
		System.out.print("Entre com o mês e ano para calcular o salário (MM/AAAA): ");
		String mes_ano = sc.next();
		int mes = Integer.parseInt(mes_ano.substring(0,2));
		int ano = Integer.parseInt(mes_ano.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Salario em " + mes_ano + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));

		
		sc.close();
	}

}
