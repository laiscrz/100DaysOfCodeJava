package exercicios.loopFor;

public class SomaNum {
    public static void main(String[] args) {
        
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }

        System.out.println("Soma total: " + sum);
    }
}
