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

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Campo vazio!");
        } else {
            this.nome = nome;
        }
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Salário incorreto!")
        } else {
            this.salario = salario;
        }
    }

    public void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("A idade não ta correta!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Funcionário: " + nome + ", Idade: " + idade + ", Salário: " + salario);
    }

}
