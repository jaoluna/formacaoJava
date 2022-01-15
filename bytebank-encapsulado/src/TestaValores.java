public class TestaValores {
    public static void main(String[] args) {
        int total = 0;
        Conta conta = new Conta(1337, 24226);
        total++;

        // conta está inconsistente
        //conta.setAgencia(-50);
        //conta.setNumero(-330);

        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337, 24765);

        // da erro System.out.println(Conta.total);

        System.out.println(Conta.getTotal());
    }
}
