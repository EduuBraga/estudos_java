package com.github.EduuBraga;

public class Card {
    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_DEPOSITO_MINIMO = 50;

    public String titular;
    public double saldo;

    public Card(String titular) {
        this.titular = titular;
    }
}
