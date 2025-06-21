package estrutura_repetitiva;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um número para calcular o fatorial: ");
		int n = sc.nextInt();
		int fatorial = 1;
		
		for(int i=n; i>=1; i--) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}
}
