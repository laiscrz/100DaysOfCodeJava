package exercicios.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenadaCrescente {

    public static void main(String[] args) {
        // declando lista
        List<Integer> listaDesordenada = new ArrayList<>();

        // add elementos
        listaDesordenada.add(80);
        listaDesordenada.add(74);
        listaDesordenada.add(96);
        listaDesordenada.add(1);
        listaDesordenada.add(22);
        listaDesordenada.add(48);
        listaDesordenada.add(105);
        listaDesordenada.add(15);
        listaDesordenada.add(38);
        listaDesordenada.add(62);

        // Criar uma nova lista e adicionar todos os elementos da listaDesordenada nela
        List<Integer> listaOrdenadaCrescente = new ArrayList<>(listaDesordenada);

        // Ordenar a lista usando Collections.sort()
        Collections.sort(listaOrdenadaCrescente);

        System.out.println("Desordenada: " + listaDesordenada);
        System.out.println("Ordenada: " + listaOrdenadaCrescente);
    }
}
