package exercicios.manipulandoStrings;

public class ConversaoCasoStrings {
    public static void main(String[] args) {
        String str = "Java";

        // toUpperCase => transforma os caracteres em 
        // letras maiusculas
        String maiuscula = str.toUpperCase();
        // toLowerCase => transforma os caracteres em 
        // letras minusculas
        String minuscula = str.toLowerCase();

        System.out.println(maiuscula);
        System.out.println(minuscula);
    }
}
