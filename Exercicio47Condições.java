package Faccat;

import java.util.Scanner;

public class Exercicio47Condi��es {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor1, valor2;

		System.out.print("Insira o primeiro n�mero: ");
		valor1 = scanner.nextInt();

		System.out.print("Insira o segundo n�mero (n�o pode ser zero): ");
		valor2 = scanner.nextInt();

		while (valor2 == 0) {
			System.out.println("VALOR INV�LIDO. O segundo valor n�o pode ser zero. Digite novamente: ");
			valor2 = scanner.nextInt();
		}

		double resultado = (double) valor1 / valor2;
		System.out.println("Resultado da divis�o: " + resultado);

		scanner.close();
	}
}


