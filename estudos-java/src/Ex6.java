import java.util.Scanner;
import java.util.Locale;

public class Ex6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		System.out.println("Digite os valores de A, B e C separados por uma quebra de linha:");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		triangulo = A * C / 2;
		circulo = Math.PI * Math.pow(C, 2);
		trapezio = (A + B) * C / 2;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		
		System.out.printf("\nTRIÂNGULO: %.3f\n", triangulo);
		System.out.printf("CÍRCULO: %.3f\n", circulo);
		System.out.printf("TRAPÉZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETÂNGULO: %.3f\n", retangulo);
		sc.close();
	}
}
