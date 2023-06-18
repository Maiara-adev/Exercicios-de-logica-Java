package Faccat;

import java.util.Scanner;

public class Exercicio53For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro N: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		scanner.close();
	}
}
