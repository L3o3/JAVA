package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalhador;

public class Trabalhador {

	private String nome;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	
	//associação com 1 classe. 1 pra 1
	private Departamento departamento;
	//associação com n classes. 1 pra muitos
	//quanto tiver uma composição "tem muitos", não colocar Objeto com lista no construtor, coloca na declaração vazia com "new ArrayList" 
	private List<HoraPorContrato> contratos = new ArrayList<>();
	
	public Trabalhador() {
	}

	public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraPorContrato> getContratos() {
		return contratos;
	}
	 
	public void adicionaContrato(HoraPorContrato Contrato) {
		contratos.add(Contrato);
	}
	
	public void removeContrato(HoraPorContrato contrato) {
		contratos.remove(contrato);
	}
	
	public Double renda(int ano, int mes) {
		Double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(HoraPorContrato c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}

	
	
}
