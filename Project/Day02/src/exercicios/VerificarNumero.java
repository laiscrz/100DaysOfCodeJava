package exercicios;

import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        // Criando obj Scanner
        Scanner scanner = new Scanner(System.in);

        // Obtendo numero
        System.out.println("Digite um numero: ");
        double num = scanner.nextDouble();

        if(num < 0){
            System.out.println("O numero " + num + ", é NEGATIVO!");
        } else if (num > 0){
            System.out.println("O numero " + num + " é POSITIVO!");
        } else {
            System.out.println("O numero " + num + " é IGUAL A ZERO!");
        }

        // Fechando Scanner
        scanner.close();
    }
}
