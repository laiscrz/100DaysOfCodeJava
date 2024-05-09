package exercicios;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // obtendo numero
        System.out.println("Digite um número para iniciar a contagem regressiva:");
        Integer num = scanner.nextInt();

        // iniciando
        System.out.println("Contagem regressiva:");

        // while
        Integer i = 0;
        while (i <= num) {
            System.out.println(num);

            num--;
        }

        // fecha scanner
        scanner.close();
    }
}
