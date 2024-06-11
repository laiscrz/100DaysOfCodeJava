package poo.model;

public class Livro extends ItemBiblioteca {
    private String isbn;

    public Livro(){

    }

    public Livro(String titulo,String autor, String isbn){
        super(titulo, autor);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("ISBN: " + getIsbn());
    }
}
