public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1334, 22266);
        //conta.numero = 1337;
        //conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente();
        //conta.titular = cliente;
        cliente.setNome("João Luna");
        conta.setTitular(cliente);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        // agora em duas linhas;

        Cliente titurlarDaConta = conta.getTitular();
        titurlarDaConta.setProfissao("Programador");

        System.out.println(cliente);
        System.out.println(conta.getTitular());
    }
}
