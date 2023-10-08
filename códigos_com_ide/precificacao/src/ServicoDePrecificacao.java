public class ServicoDePrecificacao {
    void definirPrecoVendaProduto(Produto produto, double percentualMargemDeLucro){
        double calculoMargemDeLucro = (produto.precoCusto * percentualMargemDeLucro) / 100;
        produto.precoVenda = produto.precoCusto + calculoMargemDeLucro + Produto.custoEmbalagem;
    }
}
