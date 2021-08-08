package estrutura_sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class HorasTrabalhadasDoFuncionario {

	public static void main(String[] args) {
		/*
		 * Exercício 04 Fazer um programa que leia o número de um funcionário, seu
		 * número de horas trabalhadas, o valor que recebe por hora e calcula o salário
		 * desse funcionário. A seguir, mostre o número e o salário do funcionário, com
		 * duas casas decimais.
		 */

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int number, hours;
		float salaryPerHour, monthSalary;

		number = scan.nextInt();
		hours = scan.nextInt();
		salaryPerHour = scan.nextFloat();
		monthSalary = hours * salaryPerHour;

		System.out.printf("NUMBER = %d\n", number);
		System.out.printf("SALARY = R$%.2f", monthSalary);

		scan.close();
	}
}
