package estrutura_condicional;

import java.util.Scanner;

public class PlanoTelefonia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int minutosConsumidos = sc.nextInt();
		int minutosPadrao = 100;
		double custoExcedente = 2.0;
		double valorAPagar = 50.0;

		if (minutosConsumidos > minutosPadrao) {
			valorAPagar += (minutosConsumidos - minutosPadrao) * custoExcedente;
		}
		
		System.out.printf("Valor a pagar: R$%.2f", valorAPagar);
		
		sc.close();

	}
}
