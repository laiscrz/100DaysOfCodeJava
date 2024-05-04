package exercicios.main;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// Criando objeto scanner
		Scanner scanner = new Scanner(System.in);

		// fazendo o usuario digitar um numero
		System.out.println("Digite um numero :");
		Integer num = scanner.nextInt();

		// uso e condições para verificar se é impar ou par
		if(num%2==0){
			System.out.println("O numero " + num + " é par");
		}else{
			System.out.println("O numero " + num + " é impar");
		}

		// Fechando scanner
		scanner.close();

	}

}
