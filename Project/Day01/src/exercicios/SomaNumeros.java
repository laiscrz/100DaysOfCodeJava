package exercicios;

import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
		// Criando obj scanner
		Scanner scanner = new Scanner(System.in);
		
		// Inserindo primeiro numero
		System.out.println("Digite o primeiro número: ");
		Integer num1 = scanner.nextInt();
		
		// Inserindo segundo numero
		System.out.println("Digite o segundo número: ");
		Integer num2 = scanner.nextInt();

		// Obtendo resultado
		Integer result = num1 + num2;

		// exibindo resultado
		System.out.println("O resultado de " + num1 + " + " + num2 + " é " + result);
		
		// fechando scanner
		scanner.close();
	}

}
