public class TestaTributaveis {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(2222,2222);
        contaCorrente.deposita(100);

        SeguroVida seguroVida = new SeguroVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registra(contaCorrente);
        calculadorDeImposto.registra(seguroVida);

        System.out.println(calculadorDeImposto.getTotalImposto());

    }
}
