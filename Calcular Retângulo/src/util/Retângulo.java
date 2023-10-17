package util;

public class Retângulo {

	public double Largura;
	public double Altura;
	
	public double Area() {
		return Largura * Altura;
	}
	
	public double Perimetro() {
		return  2 * (Largura + Altura);
	}
	
	public double Diagonal() {
		return  Math.sqrt(Largura*Largura + Altura*Altura);
	}
	
	public String toString() {
		return "AREA: " + Area()
			+ "PERIMETRO: " + Perimetro()
			+ "DIAGONAL: " + Diagonal();
	}
}
