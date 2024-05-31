package poo.model;

public class Carro extends Veiculo {

    private int numeroPortas;
    
    // construtor não parametrizado (vazio)
    public Carro() {
    	super();
    }
    
    // construtor parametrizado (cheio)
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
  		super(marca, modelo, ano);
  		this.numeroPortas = numeroPortas;
  	}

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

	public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro esta freando.");
    }

    // metodo exclusivo da class carro
    public void abrirPorta(){
        System.out.println("Abrindo uma porta do carro.");
    }


    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Numero de Portas: " + numeroPortas);
    };
}
