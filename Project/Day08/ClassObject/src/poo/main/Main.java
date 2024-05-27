package poo.main;

import poo.model.ClassePessoa;

public class Main {

    public static void main(String[] args) {
        
       // criar obj
       ClassePessoa pes = new ClassePessoa();
       
       // add valores aos atributos
       pes.name = "Maria";
       pes.idade = 25;
       
       // chamando metodos
       pes.apresentar();
    }
}
