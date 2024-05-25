package exercicios.listas;

import java.util.ArrayList;
import java.util.List;

public class MaiorElementoLista {
    public static void main(String[] args) {
        // declara lista
        List<Integer> listaNum = new ArrayList<>();

        // add em list
        listaNum.add(88);
        listaNum.add(14);
        listaNum.add(74);
        listaNum.add(99);
        listaNum.add(25);
        listaNum.add(38);
        listaNum.add(110);
        listaNum.add(15);

        int maior = listaNum.get(0);

        for (Integer num : listaNum) {
            if (maior < num) {
                maior = num;
            }
        }

        System.out.println("Maior Num da Lista é " + maior);

    }
}
