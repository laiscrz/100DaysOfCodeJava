package poo.model;

public class Moto extends Veiculo{

    private boolean temPartidaEletrica;
    
    // construtor não parametrizado (vazio)
    public Moto() {
    	super();
    }
    
    // construtor parametrizado (cheio)
    public Moto(String marca, String modelo, int ano, boolean temPartidaEletrica) {
		super(marca, modelo, ano);
		this.temPartidaEletrica = temPartidaEletrica;
	}

	public void setTemPartidaEletrica(boolean temPartidaEletrica) {
		this.temPartidaEletrica = temPartidaEletrica;
	}

	public boolean isTemPartidaEletrica() {
		return temPartidaEletrica;
	};
    
    @Override
    public void acelerar() {
        System.out.println("A Moto está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("A Moto está freando.");
    }

    //metodo exclusivo da classe
    public void empinar(){
        System.out.println("A moto está empinando!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tem partida eletrica: " + temPartidaEletrica);
    }
}
