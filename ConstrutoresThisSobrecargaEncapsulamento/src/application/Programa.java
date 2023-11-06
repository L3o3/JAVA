package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String Nome = sc.nextLine();
		System.out.print("Preço: ");
		double Preco = sc.nextDouble();
		Produto produto = new Produto(Nome, Preco);
		
		produto.setNome("Computador");
		System.out.println("Atualizando dados: " + produto.getNome());
		produto.setPreco(1200);
		System.out.println("Atualizando dados: " + produto.getPreco());
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);		
		System.out.println();
		System.out.print("Entre com o número de produtos que serão adicinados no estoque: ");
		
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		System.out.println();
		System.out.println("Atualizando dados: " + produto);
		System.out.println();
		System.out.print("Entre com o número de produtos que serão removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		System.out.println();
		System.out.println("Atualizando dados: " + produto);
		sc.close();
	}
}