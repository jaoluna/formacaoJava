public class TestaBanco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "João Luna";
        cliente.cpf = "222.222.222-22";
        cliente.profissao = "Programador";

        Conta conta = new Conta();
        conta.deposita(100);

        // associa o cliente ao titular da conta.
        conta.titular = cliente;
        System.out.println(conta.titular.nome);
        System.out.println(conta.titular);
        System.out.println(cliente);
    }
}
