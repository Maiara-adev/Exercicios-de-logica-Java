package Faccat;

import java.util.Scanner;

public class Exercicio60Contadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantidadeNoIntervalo = 0;
		int quantidadeForaIntervalo = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o valor " + i + ": ");
			int valor = scanner.nextInt();

			if (valor >= 10 && valor <= 20) {
				quantidadeNoIntervalo++;
			} else {
				quantidadeForaIntervalo++;
			}
		}

		System.out.println("Quantidade de valores no intervalo [10, 20]: " + quantidadeNoIntervalo);
		System.out.println("Quantidade de valores fora do intervalo [10, 20]: " + quantidadeForaIntervalo);

		scanner.close();
	}
}
