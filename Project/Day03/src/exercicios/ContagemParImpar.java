package exercicios;

import java.util.Scanner;

public class ContagemParImpar {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Obtendo num
        System.out.println("Digite um numero: ");
        Integer num = scanner.nextInt();

        //Logica while
        Integer i = 0;
        Integer contaPar = 0;
        Integer contaImpar = 0;

        while (i <= num) {
            if (i % 2 == 0) {
                contaPar++;
            } else {
                contaImpar++;
            }
            
            i++;
        }


        // Resultado
        System.out.println("QUANTIDADE PARES: " + contaPar);
        System.out.println("QUANTIDADE DE IMPAR: " + contaImpar);


        // Fechar scanner
        scanner.close();
    }
}
