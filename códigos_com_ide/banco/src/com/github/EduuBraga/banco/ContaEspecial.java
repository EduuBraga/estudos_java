package com.github.EduuBraga.banco;

public final class ContaEspecial extends ContaInvestimento {
    private final double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial (Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
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
