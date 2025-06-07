package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo, qtd;
		double preco;
		System.out.println("Digite o código do produto: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade desejada do produto: ");
		qtd = sc.nextInt();
		switch (codigo) {
		case 1:
			preco = 4.00;
			break;
			
		case 2:
			preco = 4.50;
			break;
			
		case 3:
			preco = 5.00;
			break;
			
		case 4:
			preco = 2.00;
			break;
			
		case 5:
			preco = 1.50;
			break;
			
		default:
			preco = 0;
			break;
		}
		System.out.printf("Total: R$ %.2f", preco*qtd);
		sc.close();
	}
}
