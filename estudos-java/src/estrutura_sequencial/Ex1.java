package estrutura_sequencial;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma;
		System.out.println("Digite o 1° número: ");
		num1 = sc.nextInt();
		System.out.println("Digite o 1° número: ");
		num2 = sc.nextInt();
		soma = num1 + num2;
		System.out.println("SOMA = " + soma);
		sc.close();
	}
}
