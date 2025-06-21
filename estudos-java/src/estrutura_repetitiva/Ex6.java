package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media;
		System.out.print("Digite a quantidade de casos de teste: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite a 1° nota: ");
			double nota1 = sc.nextDouble();
			System.out.printf("Digite a 2° nota: ");
			double nota2 = sc.nextDouble();
			System.out.printf("Digite a 3° nota: ");
			double nota3 = sc.nextDouble();
			
			media = (nota1*2 + nota2*3 + nota3*5)/10;
			System.out.printf("%.1f\n",media);
		}
		
		sc.close();
	}
}
