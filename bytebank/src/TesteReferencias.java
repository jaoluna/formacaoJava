public class TesteReferencias {
    public static void main(String[] args) {
        // primeriaConta é a uma referencia a um objeto;
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeria conta " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda conta " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta " + segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if (primeiraConta == segundaConta){
            System.out.println("são a mesmissima conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
