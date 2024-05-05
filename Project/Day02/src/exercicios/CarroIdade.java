package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class CarroIdade {
    
    public static void main(String[] args) {
        
        // Criando obj Scanner
        Scanner scanner = new Scanner(System.in);

        // Obtendo ano da compra do carro
        System.out.println("Digite o ano de Compra do seu carro: ");
        Integer anoCompra = scanner.nextInt();

        // Obter a data atual
        LocalDate dataAtual = LocalDate.now();

        // obtendo ano atual
        Integer anoAtual = dataAtual.getYear();
        
        // Obtendo idade carro
        Integer idadeCarro = anoAtual - anoCompra;

        // Logica para entender a situação do carro
        if(idadeCarro <= 1){
            System.out.println("Seu carro é novo!");
        } else if (idadeCarro > 1 && idadeCarro <= 5) {
            System.out.println("Seu carro é semi novo!");
        } else {
            System.out.println("Seu carro não é novo ! Ele tem " + idadeCarro + " anos.");
        }

        // Fechando scanner
        scanner.close();


    }
}
