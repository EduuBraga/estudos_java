package com.github.EduuBraga.banco;

public class CaixaEletronico {
    private final static double TARIFA_IMPRESSAO_INFORMACOES = 5;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) {
        final double tarifaDeTransferencia = (valorTransferencia * 2) / 100; // 2%

        System.out.printf("Transferencia de %.2f de %d/%d (%s) para %d/%d (%s)%n",
                valorTransferencia,
                contaOrigem.getNumero(),
                contaOrigem.getAgencia(),
                contaOrigem.getTitular().getNome(),
                contaDestino.getNumero(),
                contaDestino.getAgencia(),
                contaDestino.getTitular().getNome());

        contaOrigem.sacar(valorTransferencia + tarifaDeTransferencia);
        contaDestino.depositar(valorTransferencia);
    }

    public void imprimirInformacoes(Conta conta) {
        if(conta instanceof ContaInvestimento) {
            ContaInvestimento contaInvestimento = (ContaInvestimento) conta;

            if (contaInvestimento.getValorTotalRendimentos() > 0) {
                System.out.println("Tarifa de impressão é grátis para este tipo de conta");
            } else {
                debitarTarigaImpressaoInformacoes(conta);
            }
        } else {
            debitarTarigaImpressaoInformacoes(conta);
        }

        conta.imprimirInformacoes();
    }

    private static void debitarTarigaImpressaoInformacoes(Conta conta) {
        System.out.printf("Tarifa cobrada por impressão: R$ %.2f%n", TARIFA_IMPRESSAO_INFORMACOES);
        conta.sacar(TARIFA_IMPRESSAO_INFORMACOES);
    }
}
