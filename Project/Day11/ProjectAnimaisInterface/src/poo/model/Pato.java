package poo.model;

import poo.interfaces.Nadador;
import poo.interfaces.Corredor;
import poo.interfaces.Voador;

public class Pato implements Nadador, Corredor, Voador {

    @Override
    public void nadar() {
        System.out.println("O pato está nadando.");
    }

    @Override
    public void correr() {
        System.out.println("O pato está correndo.");
    }

    @Override
    public void voar() {
        System.out.println("O pato está voando.");
    }
}
