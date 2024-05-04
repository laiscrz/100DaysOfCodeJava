package Project.Day01.src.exercicios.main;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// Criando obj scanner
		Scanner scanner = new Scanner(System.in);
		
		// Obtendo nota1
		System.out.println("Digite a primeira nota : ");
		double nota1 = scanner.nextDouble();
		
		// Obtendo nota2
		System.out.println("Digite a segunda nota : ");
		double nota2 = scanner.nextDouble();
		
		// calculo da media
		double media = (nota1+nota2)/2;
		
		// Logica da situação
		if (media > 7) {
			System.out.println("Sua media foi " + media + ", está APROVADO!");
		} else if (media >= 4 && media <= 6 ) {
			System.out.println("Sua media foi " + media + ", terá que fazer EXAME!");
		} else {
			System.out.println("Sua media foi " + media + ", está REPROVADO!");
		}
		
		// Fechando scanner
		scanner.close();

	}

}
