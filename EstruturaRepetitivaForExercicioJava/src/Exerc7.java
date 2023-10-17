import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i ++) {
			
			int numero = i;
			int aoquadrado = i * i;
			int aocubo = i * i * i;
			
			System.out.printf("%d %d %d%n", numero, aoquadrado, aocubo);
		}
		
		sc.close();
	}

}
