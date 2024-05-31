package poo.model;

// Classe base (pai) que contém atributos comuns a todos os animais.
// As classes que herdam de Animal herdarão seus atributos e métodos.
public class Animal {

	// atributos
	private String nome;
	private int idade;
	private double peso;
	private int quantidadePatas;

	// get e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getQuantidadePatas() {
		return quantidadePatas;
	}

	public void setQuantidadePatas(int quantidadePatas) {
		this.quantidadePatas = quantidadePatas;
	}

	// metodos da classe
	public void emitirSom(){
		System.out.println("Som do animal");
	}

	public void mostrarInformacoes(){
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Quantidade de Patas: " + quantidadePatas);
	}
}
