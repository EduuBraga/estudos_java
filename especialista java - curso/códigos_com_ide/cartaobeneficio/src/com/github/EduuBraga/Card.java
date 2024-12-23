package com.github.EduuBraga;

public class Card {
    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_DEPOSITO_MINIMO = 50;

    private final String titular;
    private double saldo;

    public Card(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double valorDeposito) {
        if (valorDeposito < VALOR_DEPOSITO_MINIMO) {
            throw new IllegalArgumentException(
                    String.format("Valor de depósito não pode ser menor que %.2f", VALOR_DEPOSITO_MINIMO));
        }

        saldo += valorDeposito - TARIFA_DEPOSITO;
    }

    public void debitar(double valor) {
        if (getSaldo() < valor) {
            throw new RuntimeException("Saldo insuficiente");
        }

        saldo -= valor;
    }
}
