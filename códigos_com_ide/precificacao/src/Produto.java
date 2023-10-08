public class Produto {
    static double custoEmbalagem;
    String nome;
    double precoVenda;
    double precoCusto;

    void imprimirCaracteristicasProduto() {
        System.out.println("nome:" + nome);
        System.out.println("precoCusto:" + precoCusto);
        System.out.println("precoVenda:" + precoVenda);
    }

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
}
