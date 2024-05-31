package poo.model;

// Classe filha Gato que herda da classe Animal.
// 'extends' é a palavra-chave usada para herdar a classe base.
public class Gato extends Animal {

    // atributos
    private String raca;
    private String pelagem;

    // get e set
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato Mia.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Raça: " + raca);
        System.out.println("Pelagem: " + pelagem);
    }

}
