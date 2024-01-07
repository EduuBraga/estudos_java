package com.github.EduuBraga.banco;

public class CaixaEletronico {
    public void transferir(ContaEspecial contaOrigem, ContaEspecial contaDestino, double valorTransferencia){
        final double tarifaDeTransferencia = (valorTransferencia * 2) / 100; // 2%

        System.out.printf("Transferencia de %f.2 de d%/%d para %d/%d%n",
                valorTransferencia,
                contaOrigem.getNumero(),
                contaOrigem.getAgencia(),
                contaDestino.getNumero(),
                contaDestino.getAgencia());

        contaOrigem.sacar(valorTransferencia + tarifaDeTransferencia);
        contaDestino.depositar(valorTransferencia);
    }
}
