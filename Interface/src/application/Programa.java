package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.ServicoAluguel;
import model.services.TaxaServicoBrasil;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.println("Modelo do carro: ");
		String modeloCarro = sc.nextLine();
		System.out.println("Retirada (dd/mm/aaaa hh:mm): ");
		LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Entrega (dd/mm/aaaa hh:mm): ");
		LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);
		
		AluguelCarro ac = new AluguelCarro(inicio, fim, new Veiculo(modeloCarro));
		
		System.out.println("Entre com o preço por hora: ");
		double precoHora = sc.nextDouble();
		System.out.println("Entre com o preço por dia: ");
		double precoDia = sc.nextDouble();
		
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoHora, precoDia, new TaxaServicoBrasil());
		
		servicoAluguel.ProcessaFatura(ac);
		
		System.out.println("Fatura:");
		System.out.println("Pagamento básico: " + String.format("%.2f", ac.getFatura().getPagamentoBasico()));
		System.out.println("Imposto: " + String.format("%.2f", ac.getFatura().getTaxa()));
		System.out.println("Pagamento total: " + String.format("%.2f", ac.getFatura().getPagamentoTotal()));

		
		sc.close();
	}

}
