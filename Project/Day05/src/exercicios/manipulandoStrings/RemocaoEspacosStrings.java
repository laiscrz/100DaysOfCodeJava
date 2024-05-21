package exercicios.manipulandoStrings;

public class RemocaoEspacosStrings {
    public static void main(String[] args) {

        String str = "  Olá Mundo  ";
        String trim = str.trim();
        System.out.println(">" + trim + "<");

        String strip = str.strip();
        System.out.println(">" + strip + "<");

        String leading = str.stripLeading();
        System.out.println(">" + leading + "<");

        String trailing = str.stripTrailing();
        System.out.println(">" + trailing + "<");
    }
}
