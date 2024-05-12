package exercicios;

import java.util.Scanner;

public class Contagem {

	public static void main(String[] args) {
		// Criando objeto scanner
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		Integer num = scanner.nextInt();

		Integer indice = 0;

		System.out.println("=========== Contagem ===========");
		do {
			System.out.println(indice);

			indice ++;
		} while (indice <= num);

		//Fechando scanner
		scanner.close();

	}

}
