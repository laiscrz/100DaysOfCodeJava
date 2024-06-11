package poo.main;

import poo.model.Livro;
import poo.model.Usuario;

public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien", "123456789");
        Usuario usuario1 = new Usuario("João", "U001");

        System.out.println("---------------Livro e Usuario 1 -  Detalhes---------------");
        livro1.exibirDetalhes();
        usuario1.emprestarLivro(livro1);
        usuario1.devolverLivro(livro1);

        System.out.println("-----------------------------------------------------------");

        Livro livro2 = new Livro("A Culpa é das Estrelas", "John Green", "987654321");
        Usuario usuario2 = new Usuario("Maria", "U002");

        System.out.println("---------------Livro e Usuario 2 -  Detalhes---------------");
        livro2.exibirDetalhes();
        usuario2.emprestarLivro(livro2);
        usuario2.devolverLivro(livro2);
    }
}
