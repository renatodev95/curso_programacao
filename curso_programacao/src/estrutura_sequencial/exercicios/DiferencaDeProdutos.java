package estrutura_sequencial.exercicios;

import java.util.Scanner;

public class DiferencaDeProdutos {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
		 * segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		
		Scanner scan = new Scanner(System.in);

		int a, b, c, d, diferenca;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.printf("DIFERENCA = %d", diferenca);
		
		scan.close();
	}
}
