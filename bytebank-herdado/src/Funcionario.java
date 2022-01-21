//abstract obriga a criar metodos nas classes filhas e não permite a criacao de um objeto
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(){

    }



    //metodo sem corpo, não existe implementacao do metodo na mãe;
    public abstract double getBonificacao();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



}
