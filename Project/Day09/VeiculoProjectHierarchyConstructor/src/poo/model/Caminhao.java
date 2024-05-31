package poo.model;

public class Caminhao extends Veiculo {

    private double capacidadeCarga;
    
    // construtor não parametrizado (vazio)
    public Caminhao() {
    	super();
    }
    
    // construtor parametrizado (cheio)
    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
		super(marca, modelo, ano);
		this.capacidadeCarga = capacidadeCarga;
	}
    
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
