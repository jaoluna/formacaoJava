public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Alexandre Ottoni");
        funcionario.setCpf("222.222.222-22");
        funcionario.setSalario(2590.00);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario()+funcionario.getBonificacao());
    }
}
