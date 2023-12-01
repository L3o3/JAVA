package model.entities;

import model.enums.Cores;

public abstract class FormasAbstradas implements Formas {

	private Cores cores;

	public FormasAbstradas(Cores cores) {
		this.cores = cores;
	}

	public Cores getCores() {
		return cores;
	}

	public void setCores(Cores cores) {
		this.cores = cores;
	}
}