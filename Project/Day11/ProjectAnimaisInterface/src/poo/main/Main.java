package poo.main;

import poo.model.Cachorro;
import poo.model.Pato;
import poo.model.Peixe;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Pato pato = new Pato();
        Peixe peixe = new Peixe();

        System.out.println("-----------------Cachorro-----------------");
        cachorro.correr();

        System.out.println("-----------------Pato-----------------");
        pato.nadar();
        pato.correr();
        pato.voar();

        System.out.println("-----------------Peixe-----------------");
        peixe.nadar();
    }
}
