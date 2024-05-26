package exercicios.arrays;

public class ParImparArray {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
        int contPares = 0;
        int contImpares = 0;

        for (int num : numeros) {
            if(num % 2 == 0){
                contPares++;
            }else {
                contImpares++;
            }
        }

        System.out.println("Quantidade de Pares: " + contPares);
        System.out.println("Quantidade de Impares: " + contImpares);
    }
}
