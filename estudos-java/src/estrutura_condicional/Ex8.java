package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario, imposto = 0;
		
		System.out.println("Digite seu salário:");
		salario = sc.nextDouble();
		
		if (salario < 2000.00) {
			System.out.println("Isento");
		} 
		else if(salario <= 3000.00) {
			imposto = (salario - 2000) * 0.08;
		}
		else if (salario <= 4500) {
			imposto = (1000 * 0.08) + ((salario - 3000) * 0.18);
		} 
		else {
			imposto = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28);
		}
		if (imposto > 0) {
			System.out.printf("R$ %.2f", imposto);
		}
		sc.close();
	}
}
