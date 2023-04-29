package Trambiques;

/**
 *
 * @author rafael.fgoulart1
 */
public abstract class Funcionario {
    protected int matricula;
    protected String nome;
    protected double salario;
    
    public abstract double calcSalario();

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void mostrarFuncionario() {
        System.out.println("| ID: " + getMatricula() + "\n|   NOME: " + getNome() + "\n|   SALARIO: " + getSalario() + "\n+-----+-----+-----+-----+-----");
    }
}