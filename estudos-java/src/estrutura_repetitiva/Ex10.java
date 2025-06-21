package estrutura_repetitiva;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de linhas: ");
		double n = sc.nextInt();
		
		for (double i=1; i<=n; i++) {
			System.out.printf("%.0f %.0f %.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
		}
		sc.close();
	}
}
