package exercicios.foreach;

import java.util.ArrayList;
import java.util.List;

public class ExibirNumPositivo {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(-14);
        numeros.add(40);
        numeros.add(85);
        numeros.add(-55);
        numeros.add(-48);
        numeros.add(52);
        numeros.add(78);
        numeros.add(-15);
        numeros.add(11);
        numeros.add(-6);

        for (Integer num : numeros) {
            if (num > 0) {
                System.out.println("Positivo: " + num);
            }
        }
    }
}
