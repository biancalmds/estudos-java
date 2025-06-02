import java.util.Scanner;
import java.util.Locale;

public class Ex5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, qtd1, cod2, qtd2;
		double valor1, valor2, total;
		System.out.print("Digite o código da 1° peça: ");
		cod1 = sc.nextInt();
		System.out.print("Digite a quantidade comprada da 1° peça: ");
		qtd1 = sc.nextInt();
		System.out.print("Digite o valor unitário da 1° peça: ");
		valor1 = sc.nextDouble();
		System.out.print("Digite o código da 2° peça: ");
		cod2 = sc.nextInt();
		System.out.print("Digite a quantidade comprada da 2° peça: ");
		qtd2 = sc.nextInt();
		System.out.print("Digite o valor unitário da 2° peça: ");
		valor2 = sc.nextDouble();
		total = (qtd1 * valor1) + (qtd2 * valor2);
		System.out.printf("O valor total a pagar é: R$ %.2f", total);
		sc.close();
	}
}
