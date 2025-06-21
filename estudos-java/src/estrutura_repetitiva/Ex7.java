package estrutura_repetitiva;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de divisões que você deseja fazer: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.print("Digite o numerador: ");
			double numerador = sc.nextInt();
			System.out.print("Digite o denominador: ");
			double denominador = sc.nextInt();
			
			if (denominador == 0) {
				System.out.println("Divisão impossível");
			} else {
				System.out.println(numerador/denominador);
			}
		}
		sc.close();
	}
}
