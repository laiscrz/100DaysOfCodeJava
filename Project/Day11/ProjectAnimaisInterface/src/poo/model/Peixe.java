package poo.model;

import poo.interfaces.Nadador;

public class Peixe implements Nadador {

    @Override
    public void nadar() {
        System.out.println("O peixe está nadando.");
    }
}
