package exercicios;

import java.util.Scanner;

public class ContagemNumeros {
    public static void main(String[] args) {
        
        // Instanciando objeto scanner
        Scanner scanner = new Scanner(System.in);
        // Obtendo numero
        System.out.println("Digite um numero :");
        Integer num = scanner.nextInt();

        // Logica while para contagem
        Integer i = 0;
        while ( i <= num) {
            // printa indice
            System.out.println("Numero: " + i);

            // conta
            i++;
        }

        // Fechando scanner
        scanner.close();

    }
}
