package estrutura_repetitiva;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0, in = 0, out = 0;
		
		for (int i=0; i<n; i++) {
			 x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out +=1;
			}
		}
		
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
		
		sc.close();
	}
}
