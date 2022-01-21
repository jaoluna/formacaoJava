public class Cliente implements Autenticavel{
    private int senha;
    private AutenticacaoUtil util;
    public Cliente(){
         this.util = new AutenticacaoUtil();
    }


    //composicão
    @Override
    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }
}
