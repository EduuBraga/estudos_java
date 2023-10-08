public class Principal {
    public static void main(String[] args) {
        Produto.custoEmbalagem = 5;

        Produto arroz101 = new Produto();
        arroz101.precoCusto = 100;
        arroz101.nome = "Arroz parbo T1 1KG frd C/30";

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();

        servicoDePrecificacao.definirPrecoVendaProduto(arroz101, 10);
        arroz101.imprimirCaracteristicasProduto();

        arroz101.alterarPrecoCusto(151);
        servicoDePrecificacao.definirPrecoVendaProduto(arroz101, 12);
        arroz101.imprimirCaracteristicasProduto();
    }
}