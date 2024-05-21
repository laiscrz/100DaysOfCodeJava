package exercicios.manipulandoStrings;

public class ConcatenacaoStrings {
    public static void main(String[] args) {
        // declarando variavel do tipo strings
        String str1 = "Olá";
        String str2 = "Mundo";
        // Concatenadas com +
        String result = str1 + " " + str2;
        System.out.println(result);

        // concatenadas com método concat()
        String result2 = str1.concat(" ").concat(str2);
        System.out.println(result2);
    }
}
