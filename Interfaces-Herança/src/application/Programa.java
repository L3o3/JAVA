package application;

import model.entities.Circulo;
import model.entities.FormasAbstradas;
import model.entities.Retangulo;
import model.enums.Cores;

public class Programa {

	public static void main(String[] args) {

		FormasAbstradas s1 = new Circulo(Cores.PRETO, 2.0);
		FormasAbstradas s2 = new Retangulo(Cores.BRANCO, 3.0, 4.0);
		
		System.out.println("Cor do Circulo: " + s1.getCores());
		System.out.println("Area do Circulo: " + String.format("%.3f", s1.area()));
		System.out.println("Cor do Retangulo: " + s2.getCores());
		System.out.println("Area do Retangulo: " + String.format("%.3f", s2.area()));
	}
}
