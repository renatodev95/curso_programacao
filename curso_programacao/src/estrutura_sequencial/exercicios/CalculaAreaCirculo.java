package estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculaAreaCirculo {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio 2 
		 * Considere o valor de π = 3.14159
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		float raio, area;
		
		raio = scan.nextFloat();
		scan.close();	
		area = (float) (Math.PI * Math.pow(raio, 2));
		
		System.out.printf("A = %.4f\n", area);
	}
}
