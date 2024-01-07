package com.github.EduuBraga.banco;

public class CaixaEletronico {
    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia){
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
}
