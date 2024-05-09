package exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual numero que voce quer visualizar a tabuada? ");
        Integer num = scanner.nextInt();

        System.out.println("--------------------------");
        System.out.println("TABUADA DO NUMERO : " + num);
        System.out.println("--------------------------");
        Integer i = 0;
        while (i <= 10) {
            Integer result = i * num;
            System.out.println(i + " x " + num + " = " + result);    
            i++;
        }

        // fecha scanner
        scanner.close();
    }
}
