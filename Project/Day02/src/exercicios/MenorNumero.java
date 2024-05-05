package exercicios;

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        // Criando obj Scanner
        Scanner scanner = new Scanner(System.in);

        // Obter primeiro numero
        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        // Obter segundo numero
        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        // Obter terceiro numero
        System.out.println("Digite o terceiro numero: ");
        double num3 = scanner.nextDouble();

        // Declarando variavel menor
        double menor = num1;

        // obtendo menor numero
        if (num2 < menor){
            menor = num2;
        }

        if (num3 < menor){
            menor = num3;
        }

        // exibindo menor numero
        System.out.println("O menor numero é " + menor);

        // Fechando Scanner
        scanner.close();
    }
}
