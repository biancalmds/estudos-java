package estrutura_condicional;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um número para conferir se ele é positivo ou negativo: ");
		num = sc.nextInt();
		if (num > 0) {
			System.out.println("Positivo");
		} else if (num == 0){
			System.out.println("Zero");
		} else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}
}
