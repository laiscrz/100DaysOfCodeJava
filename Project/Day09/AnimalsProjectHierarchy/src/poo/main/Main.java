package poo.main;

import poo.model.Cachorro;
import poo.model.Gato;

public class Main {

	public static void main(String[] args) {
		// Instanciando objetos classe cachorro
		Cachorro cachorro = new Cachorro();

		System.out.println("\n-------------Cachorro-------------\n");

		// atribuindo valores
		cachorro.setNome("Bob");
		cachorro.setIdade(1);
		cachorro.setPeso(10.5);
		cachorro.setQuantidadePatas(4);
		cachorro.setRaca("Shitzu");
		cachorro.setCor("Branco");

		// chamando mostrarInformacoes()
		cachorro.mostrarInformacoes();
		// chamando metodo emitirSom()
		cachorro.emitirSom();

		// Instanciando objetos classe gato
		Gato gato = new Gato();

		System.out.println("\n-------------Gato-------------\n");

		// atribuindo valores
		gato.setNome("Estrela");
		gato.setIdade(2);
		gato.setPeso(12.4);
		gato.setQuantidadePatas(4);
		gato.setRaca("Siames");
		gato.setPelagem("Curta");

		// chamando mostrarInformacoes()
		gato.mostrarInformacoes();
		// chamando metodo emitirSom()
		gato.emitirSom();
	}

}
