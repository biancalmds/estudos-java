package estrutura_condicional;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Digite 2 números para conferir se eles são múltiplos: ");
		System.out.println("1° número: ");
		num1 = sc.nextInt();
		System.out.println("2° número: ");
		num2 = sc.nextInt();
		if (num1 == 0 || num2 == 0 ) {
			System.out.println("Zero é múltiplo de qualquer número");
		} else if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		sc.close();
	}
}
