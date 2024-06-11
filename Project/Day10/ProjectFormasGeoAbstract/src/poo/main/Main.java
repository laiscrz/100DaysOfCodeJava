package poo.main;

import poo.model.Circulo;
import poo.model.Retangulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        circulo.setCor("Vermelho");
        circulo.desenhar();

        Retangulo retangulo = new Retangulo(4.0, 6.0);
        retangulo.setCor("Azul");
        retangulo.desenhar();
    }
}
