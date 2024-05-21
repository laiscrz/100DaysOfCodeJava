package exercicios.loopFor;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para visualizar a tabuada");
        Integer num = scanner.nextInt();

        Integer result = 0;

        for (int i = 0; i <= 10; i++) {
            result = num * i;
            System.out.println( num + " x " +  i + " = " + result);
        }

        scanner.close();
    }
}
