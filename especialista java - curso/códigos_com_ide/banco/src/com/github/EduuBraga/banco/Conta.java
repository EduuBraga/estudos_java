package com.github.EduuBraga.banco;

import java.util.Objects;

public class Conta {
    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Titular getTitular() {
        return titular;
    }


    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public final double getSaldo() {
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

    public boolean possuiPermissaoImprimirInfoCaixa() {
        return false;
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
        System.out.println("titular: " + titular.getNome() + ", " + numero);
        System.out.println("agencia: " + agencia);
        System.out.println("saldo: " + saldo);
    }

    @Override
    public String toString() {
        return "Conta[" +
                "titular:" + titular +
                ", agencia:" + agencia +
                ", numero:" + numero +
                ", saldo:" + saldo +
                ']';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;

        if (this.getClass() == obj.getClass()){
            Conta conta = (Conta) obj;

            boolean comparandoSeAgenciaNumeroCorrespondem = this.getAgencia() == conta.getAgencia()
                    && this.getNumero() == conta.getNumero();

            if(comparandoSeAgenciaNumeroCorrespondem) return true;
        }

        return false;
    }
}
