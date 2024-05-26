package exercicios.arrays;

public class MaiorMenorArray {

    public static void main(String[] args) {
        int[] numeros = {5, 8, 2, 7, 9, 1};

        int menor = numeros[0];
        int maior = numeros[0];

        for (int i : numeros) {
            if(i < menor){
                menor = i;
            }

            if(i > maior){
                maior = i;
            }
        }
        
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
        
    }
}
