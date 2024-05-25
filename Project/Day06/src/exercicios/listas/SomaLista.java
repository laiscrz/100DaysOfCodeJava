package exercicios.listas;

import java.util.ArrayList;
import java.util.List;

public class SomaLista {
    
    public static void main(String[] args) {
        // Declarando a lista
        List<Integer> numeros = new ArrayList<>();

        // add valores na lista
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        int sum = 0;
        for(int numero : numeros){
            sum += numero;
        }

        System.out.println("Soma Total: " + sum);
    }
}
