package poo.model;

public class ClassePessoa {

    // atributes
	// acesso do atributo => public ou private
	// tipo do atributo => int, String
	// nome do atributo
	
    public String name;
    public int idade;

    // metodo da class
    // acesso => public
    // tipo => void (não retorna nada)
    // nome => apresentar
    public void apresentar(){
        System.out.println("Olá, meu nome é " + name);
        System.out.println("Tenho " + idade + " anos.");
    }
}
