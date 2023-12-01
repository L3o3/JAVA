package model.entities;

import model.enums.Cores;

public class Circulo extends FormasAbstradas {

	private Double raio;

	public Circulo(Cores cores, Double raio) {
		super(cores);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
}