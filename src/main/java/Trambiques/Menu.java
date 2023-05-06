package Trambiques;

/**
 *
 * @author rafael.fgoulart1
 */
public class Menu {
    public static void main(String[] args) {
        String nomes[] = {"Rafael", "Raphael", "Rafaeu", "Raffael", "Rapphael", "Ana", "Cana", "Anna", "Ama", "Cama"};
        int salF[] = {1500, 2000, 1500, 1300, 2100};
        int qntH[] = {60, 45, 50, 65, 30};
        int valH[] = {60, 60, 40, 50, 60};
        
        Funcionario funFinanceiro[] = new Funcionario[10];
        Funcionario funRH[] = new Funcionario[0];
        
        for (int i = 0; i < nomes.length - 5; i++) {
            funFinanceiro[i] = new Mensalista(i, nomes[i], 0, 1, salF[i]);
            funFinanceiro[i].setSalario(funFinanceiro[i].calcSalario());
            funFinanceiro[i].mostrarFuncionario();
        }
        
        for (int i = 5; i < nomes.length; i++) {
            funFinanceiro[i] = new Horista(i, nomes[i], 0, 2, valH[i-5], qntH[i-5]);
            funFinanceiro[i].setSalario(funFinanceiro[i].calcSalario());
            funFinanceiro[i].mostrarFuncionario();
        }
        
        Departamento depFinanceiro = new Departamento("Financeiro", "FIN", funFinanceiro);
        depFinanceiro.listarDepartamento();
        
        Departamento depRH = new Departamento("Recursos Humanos", "RH", funRH, 5);
        depRH.inserirFuncionario(new Mensalista(1, "Recurson Umano", 0, 1, 2000));
        depRH.inserirFuncionario(new Mensalista(2, "Humanus Rec", 0, 1, 2400));
        depRH.listarDepartamento();
    }
}