public class TestaSistema {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);
        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);
        Administrador administrador = new Administrador();
        administrador.setSenha(2223);
        sistemaInterno.autentica(administrador);

        //Designer designer = new Designer();
        //designer.setSenha(2224);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);
        sistemaInterno.autentica(cliente);
    }
}
