package poo.model;

public class Caminhao extends Veiculo {

    private double capacidadeCarga;

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando");
    }

    @Override
    public void frear() {
        System.out.println("O caminhão está freando");
    }

    // metodo exclusivo da classe
    public void carregar() {
        System.out.println("O caminhão está sendo carregado.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga);
    }
}
