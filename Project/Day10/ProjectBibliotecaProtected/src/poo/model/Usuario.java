package poo.model;

public class Usuario extends Pessoa {

    private String idUsuario;

    public Usuario(){

    }

    public Usuario(String nome, String idUsuario){
        super(nome);
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    // metodos
    public void emprestarLivro(Livro livro) {
        System.out.println(getNome() + " emprestou o livro: " + livro.getTitulo());
    }

    public void devolverLivro(Livro livro) {
        System.out.println(getNome() + " devolveu o livro: " + livro.getTitulo());
    }
}
