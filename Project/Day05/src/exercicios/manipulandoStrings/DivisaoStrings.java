package exercicios.manipulandoStrings;

public class DivisaoStrings {

    public static void main(String[] args) {
        // declaracao de var string
        String str = "um,dois,três,quatro";
        
        // dividindo uma string em array de strings
        // uso da virgula como delimitador
        String[] partes = str.split(",");

        // for para printar
        for (String parte : partes) {
            System.out.println(parte);
        }
    }
}
