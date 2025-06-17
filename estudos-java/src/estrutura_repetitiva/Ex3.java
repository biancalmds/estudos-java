package estrutura_repetitiva;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alcool = 0; 
		int gasolina = 0; 
		int diesel = 0;
		int escolha;
		
		do {
			System.out.print("Qual combustível você deseja?\n(1)Álcool (2)Gasolina (3) Diesel: ");
			escolha = sc.nextInt();
			
			if (escolha == 1) {
				alcool +=1;
			} else if (escolha == 2){
				gasolina += 1;
			} else if (escolha == 3) {
				diesel += 1;
			} else if (escolha == 4) {
				break;
			} else {
				System.out.println("Código inválido\n");
			}
		} while(escolha != 4);
		
		System.out.printf("MUITO OBRIGADO!\nÁlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
		
		sc.close();
	}
}
