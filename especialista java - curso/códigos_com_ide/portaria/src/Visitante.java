public class Visitante {
    static final int IDADE_MINIMA_DE_ACESSO = 18;

    String nome;
    int idade;

    boolean possuiPermissaoParaEntrar() {
        return idade > IDADE_MINIMA_DE_ACESSO;
    }
}
