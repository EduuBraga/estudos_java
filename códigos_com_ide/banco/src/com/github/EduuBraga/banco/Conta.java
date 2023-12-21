package com.github.EduuBraga.banco;

public class Conta {
    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void validarSaldoConta(double valorSaque) {
        if (getSaldo() < valorSaque) {
            throw new IllegalArgumentException("Saldo insuficiênte");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        validarSaldoConta(valorSaque);

        saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor de deposito deve ser maior que 0");
        }

        saldo += valorDeposito;
    }

    public void imprimirInformacoes() {
        System.out.println("titular: " + getTitular().getNome() + ", " + getNumero());
        System.out.println("agencia: " + agencia);
        System.out.println("saldo: " + saldo);
        System.out.println("-----------------");
    }
}
