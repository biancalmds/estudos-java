import java.util.Scanner;
import java.util.Locale;

public class Ex2 {
	
	public static void main(String[] args) {
		double raio, area;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o raio de um círculo para calcular a área do mesmo: ");
		raio = sc.nextDouble();
		area = Math.PI * Math.pow(raio, 2);
		System.out.printf("A área do círculo é: %.4f", area);
		sc.close();
	}
}
