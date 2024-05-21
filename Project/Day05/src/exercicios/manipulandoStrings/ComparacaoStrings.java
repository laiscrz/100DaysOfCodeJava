package exercicios.manipulandoStrings;

public class ComparacaoStrings {

    public static void main(String[] args) {
        String str1 = "Olá";
        String str2 = "olá";

        boolean igual = str1.equals(str2);
        System.out.println(igual);

        boolean igualIgnoraCase = str1.equalsIgnoreCase(str2);
        System.out.println(igualIgnoraCase);

        int comparacao = str1.compareTo(str2); // um valor negativo, já que "Olá" é lexicograficamente menor que "olá"
        System.out.println(comparacao);

        int comparacaoIgnoraCase = str1.compareToIgnoreCase(str2);
        System.out.println(comparacaoIgnoraCase);

    }
}
