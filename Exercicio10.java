package Faccat;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o custo de fábrica:");
		float custodefabrica = sc.nextFloat();
		double distribuidor = custodefabrica * 0.28;
		double impostos = custodefabrica * 0.45;
		double resultadoFinal = custodefabrica + distribuidor + impostos;
		System.out.println("O custo total do carro será: " + resultadoFinal);
		sc.close();
	}
}