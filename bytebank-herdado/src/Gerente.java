public class Gerente extends Funcionario implements Autenticavel{

    private AutenticacaoUtil util;

    public Gerente(){
        this.util = new AutenticacaoUtil();
    }

    public double getBonificacao(){
        System.out.println("Chamando metodo de bonificacao do gerente");
       return super.getSalario();
       // super significa que está vindo da classe mãe
   }

    @Override
    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }
}
