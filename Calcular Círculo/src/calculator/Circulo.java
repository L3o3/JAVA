package calculator;

public class Circulo {
	private double raio;
	private static final double PI = 3.14159;
			
		public double PI() {
			return 3.14159;
		}
		public void setRaio(double raio) {
	        this.raio = raio;
	    }
		public double calcularCircunferencia() {
			return 2 * PI * raio;
		}
		
		public double calcularVolume() {
			return 4 * PI * raio * raio * raio / 3;
		}
	}