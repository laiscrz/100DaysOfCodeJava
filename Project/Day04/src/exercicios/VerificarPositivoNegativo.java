package exercicios;

import java.util.Scanner;

public class VerificarPositivoNegativo {
    public static void main(String[] args) {
        // Criando objeto scanner3
		Scanner scanner = new Scanner(System.in);

        Integer num, quantidadePositivo = 0, quantidadeNegativo = 0;

        do {
            System.out.println("Digite um numero: (ou digite 0 para sair) :");
            num = scanner.nextInt();
            if (num == 0) {
                System.out.println("Voce encerrou o programa :)");
                break;
            } else if (num > 0) {
                System.out.println("O numero " + num + " é positivo");
                quantidadePositivo++;
            } else {
                System.out.println("O numero " + num + " é negativo");
                quantidadeNegativo++;
            }
        } while ( true );

		

        System.out.println("Total de Numeros Positivos : " + quantidadePositivo);
        System.out.println("Total de Numeros Negativos: " + quantidadeNegativo);

		//Fechando scanner
		scanner.close();
    }
}
