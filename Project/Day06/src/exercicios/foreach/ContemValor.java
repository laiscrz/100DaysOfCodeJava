package exercicios.foreach;

import java.util.ArrayList;
import java.util.List;

public class ContemValor {

    public static void main(String[] args) {
        // declarando lista
        List<String> palavras = new ArrayList<>();

        // add palavras
        palavras.add("Python");
        palavras.add("Ruby");
        palavras.add("JavaScript");
        palavras.add("C#");
        palavras.add("Java");
        palavras.add("PHP");
        palavras.add("Swift");
        palavras.add("C++");

        String valorProcurado = "Java";
        boolean encontrado = false;

        for (String elemento : palavras) {
            if(elemento.equals(valorProcurado)){
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("A lista contém o valor: " + valorProcurado);
        } else {
            System.out.println("A lista não contém o valor: " + valorProcurado);
        }

    }
}
