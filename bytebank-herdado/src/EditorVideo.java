public class EditorVideo extends  Funcionario{

    public double  getBonificacao(){
        System.out.println("Chamando o metodo de editor de video");
        return super.getBonificacao() + 100;
    }
}
