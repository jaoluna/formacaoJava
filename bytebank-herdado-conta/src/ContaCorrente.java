public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo = super.saldo + valor;
    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor + 0.20);
    }

    @Override
    public double getValorImposto() {
        double imposto = super.saldo * 0.01;
        return imposto;
    }
}
