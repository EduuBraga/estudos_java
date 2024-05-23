public class CadastroPortaria {
    static final int TEMPO_EXPIRACAO_PADRAO_EM_MES = 1;

    void cadastrar(Visitante visitante) {
        this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MES);
    }

    void cadastrar(Visitante visitante, int tempoExpiracaoEmMes) {
        final int tempoExpiracaoEmDias = tempoExpiracaoEmMes * 30;

        System.out.printf("%s tem %d dias para aproveitar o hotel%n",
            visitante.nome, tempoExpiracaoEmDias);
    }
}
