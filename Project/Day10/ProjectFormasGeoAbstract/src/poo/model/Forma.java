package poo.model;

public abstract class Forma {

    protected String cor;

    abstract void desenhar();

    public void setCor(String cor) {
        this.cor = cor;
    }
}
