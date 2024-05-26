package exercicios.arrays;

public class MediaArray {

    public static void main(String[] args) {
        
        int[] numeros = {5, 10, 15, 20, 25};
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        double media = (double) soma / numeros.length;

        System.out.println("A média dos elementos do array é: " + media);
    }
}
