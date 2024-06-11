package poo.main;

import poo.model.Funcionario;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Ana", "F001", "10/06/2020", "Desenvolvedora", 8000.00);

        funcionario1.exibirDetalhes();

        // Tentando modificar valores finais (isso causaria um erro de compilação se descomentado)
        // funcionario1.idFuncionario = "F002"; // Erro: cannot assign a value to final variable idFuncionario
        // funcionario1.dataContratacao = "11/06/2020"; // Erro: cannot assign a value to final variable dataContratacao

        // Modificando valores não finais
        funcionario1.setCargo("Gerente de Projetos");
        funcionario1.setSalario(9500.00);

        System.out.println("----------------PÓS - MODIFICAÇÃO---------------------");
        funcionario1.exibirDetalhes();
    }
}
