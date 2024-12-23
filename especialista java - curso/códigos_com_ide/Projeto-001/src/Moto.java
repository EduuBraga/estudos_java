public class Moto {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    double precoCompra;
    Pessoa proprietario;

    int caucularTempoDeUsoEmAnos() {
        return 2023 - anoDeFabricacao;
    }

    void imprimirResumoDepreciacao() {
        int tempoDeUso = caucularTempoDeUsoEmAnos();

        if (precoCompra <= 0) {
            System.out.println("Preço de compra do veículo está zerado. Não foi possível resumir a depreciação.");
        } else {
            String anoSingularOuPlural = tempoDeUso == 1 ? "" : "s";

            System.out.printf("Tempo de uso da %s %d: %d ano%s%n", modelo, anoDeFabricacao, tempoDeUso, anoSingularOuPlural);
            System.out.printf("Seu valor de revenda: %6.2f%n", caucularValorRevenda());
        }
    }

    double caucularValorRevenda() {
        int vidaUtilEmAnos = 20;
        int tempoDeUsoVeiculo = this.caucularTempoDeUsoEmAnos();
        double depreciamentoAnual = precoCompra / vidaUtilEmAnos;

        double valorRevenda = precoCompra - (tempoDeUsoVeiculo * depreciamentoAnual);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }
}
