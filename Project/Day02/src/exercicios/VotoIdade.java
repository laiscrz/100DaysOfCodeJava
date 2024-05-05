package exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class VotoIdade {

	public static void main(String[] args) {
		// Criando obj scanner
		Scanner scanner = new Scanner(System.in);

		// Obtendo ano nascimento
		System.out.println("Digite o ano de nascimento: ");
		Integer anoNasc = scanner.nextInt();

		// Obter obj do calendário com a data atual
        Calendar calendar = Calendar.getInstance();

		// Obtendo ano atual
		Integer anoAtual = calendar.get(Calendar.YEAR);

		//calculo para obter idade
		Integer idade = anoAtual - anoNasc;

		// Logica para obter se a pessoa é maior de idade ou nao
		if (idade >= 18){
			System.out.println("Você é maior de idade e pode votar.");
		} else {
			System.out.println("Você é menor de idade e NAO pode votar.");
		}

		// Fechando scanner
		scanner.close();

	}

}
