package Faccat;

import java.util.Scanner;

public class Exercicio20Condições {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero1 = sc.nextInt();
		System.out.println("Digite outro número ");
		int numero2= sc.nextInt();
		int crescente = 0;
		if (numero1 < numero2) {
			crescente = numero2;
			System.out.println(numero1 + " vem antes de " + crescente);
		} else if (numero2 < numero1) {
			crescente = numero1;
			System.out.println(numero2 + " vem antes de " + crescente);
		}
		sc.close();
	}

}

