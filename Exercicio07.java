package Faccat;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		int anos = sc.nextInt();
		System.out.println("Acrescente os meses desde o dia do seu �ltimo m�svers�rio: ");
		int meses = sc.nextInt();
		System.out.println("Coloque o dia do m�s que voc� est�: ");
		int dias = sc.nextInt();
		int resultadoemanos = anos * 365;
		int resultadoemmeses = meses * 30;
		int resultadoemdias = resultadoemanos + resultadoemmeses + dias;
		System.out.println("Voc� tem: " + resultadoemdias + " dias de vida");
		sc.close();
	}

}
