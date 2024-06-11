package poo.model;

public class ItemBiblioteca {
    protected String titulo;
    protected String autor;

    protected ItemBiblioteca(){

    }

    protected ItemBiblioteca(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    protected String getTitulo() {
        return titulo;
    }

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    protected String getAutor() {
        return autor;
    }

    protected void setAutor(String autor) {
        this.autor = autor;
    }
}
