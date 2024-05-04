package exercicios.main;

import java.util.Scanner;

public class VogalConsoante {

	public static void main(String[] args) {
		// Criando objeto scanner
		Scanner scanner = new Scanner(System.in);
		
		// Obtendo letra
		System.out.println("Digite uma letra: ");
		String letra = scanner.nextLine();
		
		// transformando em letra minuscula
		letra = letra.toLowerCase();
		
		// Logica para identificar se é vogal ou consoante
		if( letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			System.out.println("A letra " + letra + " é uma VOGAL!");
		}else {
			System.out.println("A letra " + letra + " é uma CONSOANTE!");
		}
		
		// Fechando Scanner
		scanner.close();

	}

}
