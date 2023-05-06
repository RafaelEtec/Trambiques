package Trambiques;

/**
 *
 * @author rafael.fgoulart1
 */
public class Horista extends Funcionario {
    private double valHora;
    private double qntHora;

    public Horista(int matricula, String nome, double salario, int categoria, double vH, double qH) {
        super(matricula, nome, salario, categoria);
        valHora = vH;
        qntHora = qH;
    }
    
    public double getValHora() {
        return valHora;
    }

    public void setValHora(double valHora) {
        this.valHora = valHora;
    }

    public double getQntHora() {
        return qntHora;
    }

    public void setQntHora(double qntHora) {
        this.qntHora = qntHora;
    }
    
    public double calcSalario() {
        return getQntHora() * getValHora();
    }
}