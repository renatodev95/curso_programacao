package estrutura_sequencial.exercicios;

import java.util.Scanner;

public class SomaDoisValores {

	public static void main(String[] args) {	
		 /*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, soma;
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		scan.close();
		
		soma = num1 + num2;
		
		System.out.println("SOMA = " + soma);
	}

}
