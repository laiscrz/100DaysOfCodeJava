package exercicios.foreach;

import java.util.ArrayList;
import java.util.List;

public class MediaLista {
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(40);
        lista.add(10);
        lista.add(15);
        lista.add(24);

        int sum = 0;
        for (Integer elemento : lista) {
            sum += elemento;
        }

        int media = sum / lista.size();
        System.out.println("Média: " + media);

    }
}
