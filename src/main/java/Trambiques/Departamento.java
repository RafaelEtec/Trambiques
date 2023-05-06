package Trambiques;

/**
 *
 * @author rafael.fgoulart1
 */
public class Departamento {
    protected String nome;
    protected String sigla;
    protected Funcionario func[];
    protected static int indice = 0;

    public Departamento() {}
    
    public Departamento(String nome, String sigla, Funcionario[] func, int tamanho) {
        this.nome = nome;
        this.sigla = sigla;
        this.func = new Funcionario[tamanho];
    }
    
    public Departamento(String nome, String sigla, Funcionario[] func) {
        this.nome = nome;
        this.sigla = sigla;
        this.func = func;
    }

    public void inserirFuncionario(Funcionario oFun) {
        func[indice++] = oFun;
    }
    
    public void listarDepartamento() {
        System.out.println(
                "| Nome: " + getNome() +
                "\n|   Sigla: " + getSigla() +
                "\n| " + 
                "\n| Funcionarios: " +
                "\n+-----+-----+-----+-----+-----");
        for (int i = 0; i < func.length; i++) {
            if (func[i] != null) {
                func[i].mostrarFuncionario();
            }
        }
    }
    
    public void totalSalarioFuncionario(int categoria) {
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Funcionario[] getFunc() {
        return func;
    }

    public void setFunc(Funcionario[] func) {
        this.func = func;
    }
}