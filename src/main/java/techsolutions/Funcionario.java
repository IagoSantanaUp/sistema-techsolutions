package techsolutions;

public class Funcionario {

    public String nome;
    public int idade;
    public double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.println("Funcionário: " + nome + ", Idade: " + idade + ", Salário: " + salario);
    }

}
