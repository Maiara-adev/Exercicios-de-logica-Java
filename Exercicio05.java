package Faccat;
import java.util.Scanner;
public class Exercicio05{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero=sc.nextInt();
		int antecessor=numero-1;
		System.out.println("O antecessor de "+numero+" é: "+antecessor+"!");
		sc.close();
	}
}
