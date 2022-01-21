import javax.naming.ldap.Control;

public class TestaReferencias {
    public static void main(String[] args) {
        //Gerente g1 = new Gerente();
        //funciona pois é a classe mais generica ou classe mãe
        // Funcionario g1 = new Gerente();
        //Da erro, mas podemos fazer o casting.
        //Gerente g1 = (Gerente) new Funcionario();
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        // g1.autentica(2222);
        // System.out.println(nome);

        ControleBonificacao  controleBonificacao = new ControleBonificacao();

        controleBonificacao.registra(g1);
        System.out.println(controleBonificacao.getSoma());


        //Funcionario f = new Funcionario();
        //f.setSalario(2000);
        //controleBonificacao.registra(f);
        System.out.println(controleBonificacao.getSoma());


        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setSalario(2500.0);
        controleBonificacao.registra(editorVideo);

        System.out.println(controleBonificacao.getSoma());

        //Funcionario funcionario = new Funcionario();
        //funcionario.setSalario(1000);
        //controleBonificacao.registra(funcionario);

        //System.out.println(funcionario.getBonificacao());
        System.out.println(controleBonificacao.getSoma());
    }
}
