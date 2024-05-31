package poo.main;

import poo.model.Carro;

public class MainCarro {

	public static void main(String[] args) {
		// com construtor vazio
		Carro carro = new Carro();

		carro.setMarca("Toyota");
		carro.setMarca("Corolla");
		carro.setAno(2022);
		carro.setNumeroPortas(4);

		System.out.println("---------Carro Sem Construtor---------");
		carro.exibirInformacoes();
		System.out.println("------------------");
		carro.abrirPorta();
		carro.acelerar();
		carro.frear();
		System.out.println("------------------");
		

		// com construtor cheio
		Carro carro2 = new Carro("Honda", "Civic", 2021, 5);

		System.out.println("---------Carro Com Construtor---------");
		carro2.exibirInformacoes();
		System.out.println("------------------");
		carro2.abrirPorta();
		carro2.acelerar();
		carro2.frear();
		System.out.println("------------------");
	}

}
