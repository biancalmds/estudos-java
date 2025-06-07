package estrutura_condicional;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio, fim, duracao;
		System.out.println("Digite a hora em que o jogo começou: ");
		inicio = sc.nextInt();
		System.out.println("Digite a hora em que o jogo terminou: ");
		fim = sc.nextInt();
		
		if (inicio == fim) {
			duracao = 24;
		} else if (inicio > fim) {
			duracao = (24 - inicio) + fim;
		} else {
			duracao = fim - inicio;
		}
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		sc.close();
	}
}
