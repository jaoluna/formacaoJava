//molde de uma conta
public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    //static é para deixar a variavel global, torna a variavel da classe;
    private static int total = 0 ;

    public Conta(){

    }
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("o total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta" + this.numero);
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saca(valor)){
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    /*public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }*/

    public int getAgencia() {
        return this.agencia;
    }

   /* public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }*/

    public void setTitular(Cliente cliente) {
        this.titular = cliente;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
