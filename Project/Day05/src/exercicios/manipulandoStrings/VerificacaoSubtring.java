package exercicios.manipulandoStrings;

public class VerificacaoSubtring {

    public static void main(String[] args) {
        String str = "Olá Mundo";

        boolean contem = str.contains("Mundo");
        System.out.println(contem); // Saída: true

        boolean comecaCom = str.startsWith("Olá");
        System.out.println(comecaCom); // Saída: true

        boolean terminaCom = str.endsWith("Mundo");
        System.out.println(terminaCom); // Saída: true

    }
}
