package Trambiques;

/**
 *
 * @author rafael.fgoulart1
 */
public class Menu {
    public static void main(String[] args) {
        Horista oH = new Horista();

        oH.matricula = 1;
        oH.nome = "leafaR";
        oH.setValHora(90);
        oH.setQntHora(240);
        oH.salario = oH.calcSalario();
        oH.mostrarFuncionario();
        
        Mensalista oM = new Mensalista();
        oM.matricula = 2;
        oM.nome = "ordeP";
        oM.setSalFixo(9000);
        oM.salario = oM.calcSalario();
        oM.mostrarFuncionario();
    }
}