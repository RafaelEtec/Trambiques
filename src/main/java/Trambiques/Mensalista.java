package Trambiques;

/**
 *
 * @author rafael.fgoulart1
 */
public class Mensalista extends Funcionario {
    private double salFixo;

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