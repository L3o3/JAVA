import java.util.Locale;
import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int N = sc.nextInt();
				
		for (int i = 0; i < N; i++) {
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			
			double soma = (x * 2.0 + y * 3.0 + z * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", soma);
		}
		
		sc.close();
	}

}
