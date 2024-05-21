package exercicios.loopFor;

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de termos da sequência de Fibonacci que você deseja ver: ");
        int n = scanner.nextInt();

        int num1 = 0, num2 = 1;

        System.out.print("Os primeiros " + n + " termos da sequência de Fibonacci são: ");

        for (int i = 1; i <= n; i++) {
            System.out.println(num1 + " ");

            // Calculando o próximo termo da sequência
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }

        scanner.close();
    }
}
