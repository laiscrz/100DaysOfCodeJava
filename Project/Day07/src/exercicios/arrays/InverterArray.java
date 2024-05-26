package exercicios.arrays;

public class InverterArray {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int n = numeros.length;

        for(int i = 0; i < n / 2; i++){
            int temp = numeros[i];
            numeros[i] = numeros[n - 1 - i];
            numeros[n - 1 - i] = temp;
        }

        for (int i : numeros) {
            System.out.println(i + " ");
        }
    }
}
