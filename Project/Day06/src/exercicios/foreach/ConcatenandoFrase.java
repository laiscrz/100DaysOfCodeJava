package exercicios.foreach;

import java.util.ArrayList;
import java.util.List;

public class ConcatenandoFrase {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

       // Adicionando todas as palavras da frase à lista
       palavras.add("A");
       palavras.add("arte");
       palavras.add("de");
       palavras.add("programar");
       palavras.add("consiste");
       palavras.add("em");
       palavras.add("organizar");
       palavras.add("e");
       palavras.add("dominar");
       palavras.add("a");
       palavras.add("complexidade.");

       // Imprimindo a lista de palavras
       System.out.println("Lista de palavras:");

       String frase = "";
       for (String palavra : palavras) {
        frase += palavra + " ";
       }

       System.out.println("Frase: " + frase);
    }
}
