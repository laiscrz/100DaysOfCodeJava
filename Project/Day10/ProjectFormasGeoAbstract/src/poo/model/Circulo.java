package poo.model;

public class Circulo extends Forma {

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo de cor: " + cor + " e raio: " + raio);
    }
}
