package estrutura_repetitiva;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		do {
			System.out.print("Digite o valor de X: ");
			x = sc.nextInt();
			System.out.print("Digite o valor de Y: ");
			y = sc.nextInt();
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante\n");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante\n");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante\n");
			} else if (x > 0 && y < 0){
				System.out.println("Quarto quadrante\n");
			} else {
				break;
			}
		} while(x != 0 || y != 0);
				
		sc.close();
	}
}