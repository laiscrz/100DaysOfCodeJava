package poo.model;

public class Retangulo extends Forma {

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um retângulo de cor: " + cor + ", largura: " + largura + " e altura: " + altura);
    }
}
