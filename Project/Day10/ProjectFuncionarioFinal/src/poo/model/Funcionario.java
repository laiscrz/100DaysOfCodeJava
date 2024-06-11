package poo.model;

public class Funcionario extends Pessoa {
    // final
    private final String idFuncionario;
    private final String dataContratacao;

    private String cargo;
    private double salario;

    public Funcionario(String nome, String idFuncionario, String dataContratacao, String cargo, double salario){
        super(nome);
        this.idFuncionario = idFuncionario;
        this.dataContratacao = dataContratacao;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("ID Funcionário: " + getIdFuncionario());
        System.out.println("Data de Contratação: " + getDataContratacao());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: " + getSalario());
    }
}
