package exercicios;

import java.util.Scanner;

public class SomaNumPositivo {
    public static void main(String[] args) {
        // Criando objeto scanner
		Scanner scanner = new Scanner(System.in);

		Integer num, soma = 0;

		do {
			System.out.println("Digite um numero positivo (ou negativo para sair) : ");
            num = scanner.nextInt();
            if (num >= 0) {
                soma += num;
            } 
			
		} while ( num >= 0);

        System.out.println("Soma total: " + soma);

		//Fechando scanner
		scanner.close();
    }
}
