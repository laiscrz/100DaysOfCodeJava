package exercicios.switchs;

import java.util.Scanner;

public class ClassificandoNotaSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma nota (A, B, C, D, F): ");
        char nota = scanner.next().charAt(0);

        switch (nota) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bom");
                break;
            case 'C':
                System.out.println("Regular");
                break;
            case 'D':
                System.out.println("Ruim");
                break;
            case 'F':
                System.out.println("Falhou");
                break;
            default:
                System.out.println("Nota inválida!");
                break;
        }
        scanner.close();

    }
}
