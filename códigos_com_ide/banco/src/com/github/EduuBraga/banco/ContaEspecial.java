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

    protected void validarSaldoConta(double valorSaque) {
        if(getLimiteDisponivel() < valorSaque) {
            throw new IllegalArgumentException("Saldo insuficiênte");
        }
    }

    public void imprimirInformacoes() {
        System.out.println("titular: " + getTitular().getNome() + ", " + getNumero());
        System.out.println("agencia: " + getAgencia());
        System.out.println("saldo: " + getSaldo());
        System.out.println("Limite disponível: " + getLimiteDisponivel());
        System.out.println("-----------------");
    }
}
