package exercicios.listas;

import java.util.ArrayList;
import java.util.List;

public class NumNegativosZero {
    public static void main(String[] args) {
        List<Integer> listaNum = new ArrayList<>();

        // add em list
        listaNum.add(88);
        listaNum.add(-14);
        listaNum.add(74);
        listaNum.add(99);
        listaNum.add(-25);
        listaNum.add(38);
        listaNum.add(110);
        listaNum.add(-15);
        listaNum.add(-77);
        listaNum.add(55);

        // Substituir números negativos por zero
        for (int i = 0; i < listaNum.size(); i++) {
            if (listaNum.get(i) < 0) {
                listaNum.set(i, 0);
            }
        }

        System.out.println("Lista atual: " + listaNum);
    }
}
