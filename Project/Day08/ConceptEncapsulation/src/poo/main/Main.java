package poo.main;

import poo.model.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		// cria obj
		Pessoa pes = new Pessoa();
		
		//usando set para modificar
		pes.setNome("João");
		pes.setIdade(19);
		pes.setEndereco("Av. Paulista");
		
		// metodo
		pes.mostrarInformacoes();
		
		// acessar e printar com get
		System.out.println("Informações: " + pes.getNome() + "; " + pes.getIdade() + "; " + pes.getEndereco());

	}

}
