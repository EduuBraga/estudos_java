public class Produto {
    static double custoEmbalagem;

    String nome;
    double precoVenda;
    double precoCusto;

    static void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

    static void imprimirCustoEmbalagem() {
        System.out.printf("Custo de embalagem: %.2f", custoEmbalagem);
    }

    void imprimirCaracteristicasProduto() {
        System.out.println("nome:" + nome);
        System.out.println("precoCusto:" + precoCusto);
        System.out.println("precoVenda:" + precoVenda);
    }

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
}
