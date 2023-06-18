package Faccat;

import java.util.Scanner;

public class Exercicio47Condições {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor1, valor2;

		System.out.print("Insira o primeiro número: ");
		valor1 = scanner.nextInt();

		System.out.print("Insira o segundo número (não pode ser zero): ");
		valor2 = scanner.nextInt();

		while (valor2 == 0) {
			System.out.println("VALOR INVÁLIDO. O segundo valor não pode ser zero. Digite novamente: ");
			valor2 = scanner.nextInt();
		}

		double resultado = (double) valor1 / valor2;
		System.out.println("Resultado da divisão: " + resultado);

		scanner.close();
	}
}


