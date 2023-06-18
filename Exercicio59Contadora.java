package Faccat;

import java.util.Scanner;

public class Exercicio59Contadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantidadeNegativos = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o valor " + i + ": ");
			int valor = scanner.nextInt();

			if (valor < 0) {
				quantidadeNegativos++;
			}
		}

		System.out.println("Quantidade de valores negativos: " + quantidadeNegativos);

		scanner.close();
	}

}
