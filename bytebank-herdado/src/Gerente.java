public class Gerente extends Funcionario {
    private int senha;

    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        }else {
            return false;
        }
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }


    public double getBonificacao(){
        System.out.println("Chamando metodo de bonificacao do gerente");
       return super.getBonificacao() + super.getSalario();
       // super significa que está vindo da classe mãe
   }

}
