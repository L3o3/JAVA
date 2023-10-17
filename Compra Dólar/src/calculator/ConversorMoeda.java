package calculator;

public class ConversorMoeda{

	public static double IOF = 1.06;
	
	public double conversao (double cotacao, double quantidade) {
		return cotacao * quantidade * IOF;
	}
}
