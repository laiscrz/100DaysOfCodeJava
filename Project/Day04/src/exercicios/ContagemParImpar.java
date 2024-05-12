package exercicios;

import java.util.Scanner;

public class ContagemParImpar {
    public static void main(String[] args) {
        // Criando objeto scanner3
		Scanner scanner = new Scanner(System.in);

        Integer num, quantidadePar = 0, quantidadeImpar = 0;

		do {
			System.out.println("Digite um numero : (se quiser sair digite 0 ) ");
            num = scanner.nextInt();
            if( num == 0) {
                System.out.println("Voce encerrou o programa");
                break;
            } else if (num % 2 ==  0) {
                System.out.println("O numero " + num + " é Par");
                quantidadePar ++;
            } else {
                System.out.println("O numero " + num + " é Impar");
                quantidadeImpar ++;
            }
			
		} while ( true );

        System.out.println("Total de Pares: " + quantidadePar);
        System.out.println("Total de Impares: " + quantidadeImpar);

		//Fechando scanner
		scanner.close();
    }
}
