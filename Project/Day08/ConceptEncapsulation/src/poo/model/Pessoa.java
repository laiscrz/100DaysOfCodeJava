package poo.model;

public class Pessoa {

	private String nome;
	private int idade;
	private String endereco;
	
	// acessar valor nome
	public String getNome() {
		return nome;
	}
	
	// modificar valor nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	// metodo para mostrar informações
	public void mostrarInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Endereco: " + endereco);
	}
}
