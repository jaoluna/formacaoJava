public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(111, 222);
        contaCorrente.deposita(100);

        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 333);
        contaPoupanca.deposita(200);

        contaCorrente.transfere(10, contaPoupanca);

        System.out.println(contaCorrente.getSaldo());

        System.out.println(contaCorrente.getValorImposto());


    }
}
