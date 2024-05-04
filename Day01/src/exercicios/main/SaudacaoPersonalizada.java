package exercicios.main;

import java.util.Scanner;

public class SaudacaoPersonalizada {

	public static void main(String[] args) {
		//Criando obj scanner
		Scanner scanner = new Scanner(System.in);

		// Obtendo nome
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();

		// exibindo saudacao
		System.out.println("Olá " + nome + ", Seja bem-vindo(a) !");

		// Fechando scanner
		scanner.close();

	}

}
