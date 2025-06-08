package estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int nFuncionario, horasTrabalhadas;
		double valorHora, salario;
		
		System.out.print("Digite o número do funcionário: ");
		nFuncionario = sc.nextInt();
		System.out.print("Digite a quantidade de horas trabalhadas do funcionário: ");
		horasTrabalhadas = sc.nextInt();
		System.out.print("Digite o valor que ele recebe por hora: ");
		valorHora = sc.nextDouble();
		salario = valorHora * horasTrabalhadas;
		
		System.out.printf("\nNúmero do funcionário: %d\n", nFuncionario);
		System.out.printf("Salário do funcionário: R$ %.2f\n", salario);
		sc.close();
	}

}
