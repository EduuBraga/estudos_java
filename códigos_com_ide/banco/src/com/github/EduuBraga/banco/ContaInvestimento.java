package com.github.EduuBraga.banco;

public class ContaInvestimento extends Conta {
    public ContaInvestimento (Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    private double valorTotalRendimentos;

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualJuros) {
        if(getSaldo() > 0) {
            double valorRendimentos = getSaldo() * percentualJuros / 100;
            this.valorTotalRendimentos += valorRendimentos;
            depositar(valorRendimentos);
        }else{
            System.out.println("Não à saldo para finalizar rendimentos");
        }

    }
}
