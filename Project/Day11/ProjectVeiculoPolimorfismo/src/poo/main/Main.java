package poo.main;

import poo.model.Bicicleta;
import poo.model.Carro;
import poo.model.Veiculo;

public class Main {

    public static void main(String[] args) {
        Veiculo[] veiculos = { new Carro(), new Bicicleta() };

        System.out.println("----------------Override----------------");
        for (Veiculo veiculo : veiculos) {
            veiculo.mover(); // Polimorfismo em tempo de execução (override)
        }

        System.out.println("----------------Overloaded----------------");
        Veiculo veiculo = new Veiculo();
        veiculo.mover(); // Método genérico
        veiculo.mover(100); // Método sobrecarregado
        veiculo.mover("estrada"); // Método sobrecarregado
        veiculo.mover(50, "areia"); // Método sobrecarregado
    }
}
