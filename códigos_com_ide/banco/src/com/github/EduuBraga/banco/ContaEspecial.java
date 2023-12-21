package com.github.EduuBraga.banco;

public class ContaEspecial extends Conta {
    private double tarifaMensal;
    private double limiteChequeEspecial;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

    public double getLimiteDisponivel() {
        return getSaldo() + limiteChequeEspecial;
    }

    @Override
    protected void validarSaldoConta(double valorSaque) {
        if(getLimiteDisponivel() < valorSaque) {
            throw new IllegalArgumentException("Saldo insuficiênte");
        }
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();

        System.out.println("Limite disponível: " + getLimiteDisponivel());
    }
}
