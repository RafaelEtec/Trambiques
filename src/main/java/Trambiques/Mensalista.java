package Trambiques;

/**
 *
 * @author rafael.fgoulart1
 */
public class Mensalista extends Funcionario {
    private double salFixo;

    public Mensalista(int matricula, String nome, double salario, int categoria, double sF) {
        super(matricula, nome, salario, categoria);
        salFixo = sF;
    }
    
    public double getSalFixo() {
        return salFixo;
    }

    public void setSalFixo(double salFixo) {
        this.salFixo = salFixo;
    }
    
    public double calcSalario() {
        return getSalFixo();
    }
}