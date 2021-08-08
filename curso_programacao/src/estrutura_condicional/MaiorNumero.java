package estrutura_condicional;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c, menor;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a <= b && a <= c) {
			menor = a;
		} else if (b <= a && b <= c) {
			menor = b;
		} else {
			menor = c;
		}
		
		System.out.printf("MENOR = %d", menor);

		sc.close();

	}
}
