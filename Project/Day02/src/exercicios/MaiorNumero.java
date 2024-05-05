package exercicios;

import java.util.Scanner;

public class MaiorNumero {
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

        // declarando variavel maior
        double maior = num1;

        // Obtendo numero maior
        if (num2 > maior){
            maior = num2;
        }
        
        if (num3 > maior){
            maior = num3;
        }

        // exibindo maior numero
        System.out.println("O numero maior é " + maior);

        // Fechando Scanner
        scanner.close();
    }
}
