package application;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho da pasta: ");
		String strCaminho = sc.nextLine();
		
		File caminho = new File(strCaminho);
		
		System.out.println("Busca caminho: " + caminho.getPath());
		System.out.println("Busca pasta de origem: " + caminho.getParent());
		System.out.println("Busca nome: " + caminho.getName());

		
	}

}
