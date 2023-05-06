package Trambiques;

/**
 *
 * @author rafael.fgoulart1
 */
public abstract class Funcionario {
    protected int matricula;
    protected String nome;
    protected double salario;
    protected int categoria;
    
    public abstract double calcSalario();

    public Funcionario(int matricula, String nome, double salario, int categoria) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.categoria = categoria;
    }
    
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

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    public void mostrarFuncionario() {
        String strCat = getCategoria() == 1 ? "Mensalista" : "Horista";
        System.out.println(
                  "| ID: " + getMatricula() +
                "\n|   NOME: " + getNome() +
                "\n|   SALARIO: " + getSalario() +
                "\n|   Categoria: " + strCat +
                "\n+-----+-----+-----+-----+-----");
    }
}