public class EditorVideo extends  Funcionario{

    @Override
    public double  getBonificacao(){
        System.out.println("Chamando o metodo de editor de video");
        return 150;
    }
}
