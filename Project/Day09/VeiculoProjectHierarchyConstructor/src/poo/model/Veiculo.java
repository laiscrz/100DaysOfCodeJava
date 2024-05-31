package poo.model;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    
    //get e set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    // metodos
    public void acelerar(){
        System.out.println("O veiculo está acelerando ");
    }

    public void frear(){
        System.out.println("O veiculo está freiando.");
    }

    public exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Compra: " + ano);
    }
}
