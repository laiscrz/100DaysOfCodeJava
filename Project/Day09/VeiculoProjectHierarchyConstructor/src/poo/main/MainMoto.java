package poo.main;

import poo.model.Moto;

public class MainMoto {

	public static void main(String[] args) {
		// com construtor vazio
		Moto moto = new Moto();

		moto.setMarca("Honda");
		moto.setModelo("CBR 1000RR");
		moto.setAno(2023);
		moto.setTemPartidaEletrica(false);

		System.out.println("---------Moto Sem Construtor---------");
		moto.exibirInformacoes();
		System.out.println("------------------");
		moto.acelerar();
		moto.empinar();
		moto.frear();
		System.out.println("------------------");
		
		// com construtor cheio
		Moto moto2 = new Moto("Yamaha", "YZF-R6", 2022, true);

		System.out.println("---------Moto Com Construtor---------");
		moto2.exibirInformacoes();
		System.out.println("------------------");
		moto2.acelerar();
		moto2.empinar();
		moto2.frear();
		System.out.println("------------------");
	}

}
