package Faccat;

import java.util.Scanner;

public class Exercicio17Condições {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a primeira nota do aluno: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a segunda nota do aluno");
		float nota2 = sc.nextFloat();
		float media = (nota1 + nota2)/2;
		if (media < 6) {
			System.out.println("A média do aluno foi de: " + media + " por isso o aluno esta retido! ");
		}
		else {
			System.out.println("A média do aluno foi de: " + media + " por isso o aluno está aprovado! ");
		}
		sc.close();
	}

}
	

