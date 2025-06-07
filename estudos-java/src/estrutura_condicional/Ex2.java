package estrutura_condicional;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um número para conferir se é par ou ímpar: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
		sc.close();
	}
}
