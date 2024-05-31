package poo.main;

import poo.model.Caminhao;

public class MainCaminhao {

	public static void main(String[] args) {
		// com construtor vazio
		Caminhao caminhao = new Caminhao();

		caminhao.setMarca("Volvo");
		caminhao.setModelo("FH16");
		caminhao.setAno(2019);
		caminhao.setCapacidadeCarga(25000.0);

		System.out.println("---------Caminhao Sem Construtor---------");
		caminhao.exibirInformacoes();
		System.out.println("------------------");
		caminhao.carregar();
		caminhao.acelerar();
		caminhao.frear();
		System.out.println("------------------");

		// com construtor cheio
		Caminhao caminhao2 = new Caminhao("Scania", "R500", 2021, 30000.0);
		System.out.println("---------Caminhao Com Construtor---------");
		caminhao2.exibirInformacoes();
		System.out.println("------------------");
		caminhao.carregar();
		caminhao.acelerar();
		caminhao.frear();
		System.out.println("------------------");
	}

}
