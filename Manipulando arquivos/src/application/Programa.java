package application;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho da pasta: ");
		String strCaminho = sc.nextLine();
		
		File caminho = new File(strCaminho);
		
		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("Caminho:");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		
		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("Pasta:");
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		boolean sucesso = new File(strCaminho + "\\subdir").mkdir();
		System.out.println("Diretorio criado com sucesso: " + sucesso);
		
		
		sc.close();
	}

}
