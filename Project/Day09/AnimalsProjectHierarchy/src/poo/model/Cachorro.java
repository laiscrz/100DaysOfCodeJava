package poo.model;

// Classe filha Cachorro que herda da classe Animal.
// 'extends' é a palavra-chave usada para herdar a classe base.>
public class Cachorro extends Animal{

    // atributos
    private String raca;
    private String cor;

    // get e set
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

     // Método sobrescrito para emitir o som específico do cachorro
     @Override
     public void emitirSom() {
        System.out.println("O cachorro late.");
     }
 
     // Método sobrescrito para mostrar as informações específicas do cachorro
     @Override
     public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Raça: " + raca);
        System.out.println("Cor: " + cor);
     }

}
