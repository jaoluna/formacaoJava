//classe intermediaria para autenticar alguns funcionarios
// interface é uma classe abstrata com todos seus metodos abstratos
//contrato Autenticavel : quem assina esse contrato precisa implementar  metodos setSenha e autentica
public abstract interface Autenticavel {

    public abstract boolean autentica(int senha);

    public abstract void setSenha(int senha);
}
