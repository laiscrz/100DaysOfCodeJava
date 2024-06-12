package poo.model;

import poo.interfaces.Corredor;

public class Cachorro implements Corredor {

    @Override
    public void correr() {
        System.out.println("O cachorro está correndo.");
    }
}
