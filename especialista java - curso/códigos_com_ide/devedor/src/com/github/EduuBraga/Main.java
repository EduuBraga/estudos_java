package com.github.EduuBraga;

public class Main {
    public static void main(String[] args) {
        Fornecedor pentenet = new Fornecedor("Pentenet");

        ContaPendente contaInternet = new ContaPendente();
        contaInternet.setDescricao("Conta da internet");
        contaInternet.setValor(79.89);
        contaInternet.setDataVencimento("10/12/23");
        contaInternet.setFornecedor(pentenet);

        contaInternet.pagar();
        imprimirInfoConta(contaInternet);

        contaInternet.cancelarPagamento();
        imprimirInfoConta(contaInternet);

        contaInternet.pagar();
        imprimirInfoConta(contaInternet);
    }

    public static void imprimirInfoConta(ContaPendente conta) {
        System.out.printf("Fornecedor: %s%n", conta.getFornecedor().getNome());
        System.out.printf("Descrição: %s%n", conta.getDescricao());
        System.out.printf("Vencimento: %s%n", conta.getDataVencimento());
        System.out.printf("Valor: %.2f%n", conta.getValor());
        System.out.printf("Pago? %s%n", conta.isPago() ? "Sim" : "Não");
        System.out.println("--------------------------");
    }
}
