package exercicios.arrays;

public class SomaArray {

    public static void main(String[] args) {
        // declarando array
        int[] numeros = {1,2,3,4,5};
        
        int soma = 0;

        for(int num : numeros){
            soma += num;
        }

        System.out.println("A soma dos elementos do array é: " + soma);
    }
}
