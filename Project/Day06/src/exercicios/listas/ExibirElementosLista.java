package exercicios.listas;

import java.util.ArrayList;
import java.util.List;

public class ExibirElementosLista {

    public static void main(String[] args) {
        // declarando lista
        List<String> palavras = new ArrayList<>();

        // add palavras
        palavras.add("Brasil");
        palavras.add("Argentina");
        palavras.add("Uruguai");
        palavras.add("Bolivia");
        palavras.add("Chile");
        palavras.add("Paraguai");

        for (String elemento : palavras) {
            System.out.println(elemento);
        }
    }
}
