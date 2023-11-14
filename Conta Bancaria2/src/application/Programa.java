package application;

import entities.ContaNegocio;

public class Programa {

	public static void main(String[] args) {

		ContaNegocio conta = new ContaNegocio(8008, "Leoe", 0.0, 500.0);
		
		System.out.println(conta.getLimiteCredito());
		
	}

}
