package entities;

import entities.enums.Cores;

public abstract class Formas {

	private Cores cor;
	
	public Formas() {
	}
	
	public Formas(Cores cor) {
		this.cor = cor;
	}

	public Cores getCores() {
		return cor;
	}

	public void setCores(Cores cor) {
		this.cor = cor;
	}
	
	public abstract double area();
}