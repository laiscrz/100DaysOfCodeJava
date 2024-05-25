package exercicios.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesestruturandoFrase {

    public static void main(String[] args) {
        String frase = "Toda cicatriz tem sua própria beleza.";

        List<String> palavras = new ArrayList<>(Arrays.asList(frase.split(" ")));

        System.out.println(palavras);

        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
