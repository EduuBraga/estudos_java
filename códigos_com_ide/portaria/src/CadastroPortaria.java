public class CadastroPortaria {
    void cadastrar(Visitante visitante, int tempoExpiracaoEmMes) {
        final int tempoExpiracaoEmDias = tempoExpiracaoEmMes * 30;

        System.out.printf("%s tem %d dias para aproveitar o hotel",
            visitante.nome, tempoExpiracaoEmDias);
    }
}
