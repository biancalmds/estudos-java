import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, diferenca;
		System.out.println("Digite 4 valores um embaixo do outro: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		diferenca = (A*B) - (C*D);
		System.out.printf("A diferença do produto de A e B pelo produto de C e D é: %d", diferenca);
		sc.close();
	}
	
}
