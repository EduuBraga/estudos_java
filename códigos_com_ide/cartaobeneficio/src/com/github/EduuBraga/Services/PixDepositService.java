package com.github.EduuBraga.Services;

import com.github.EduuBraga.Card;
import com.github.EduuBraga.Receipt;

public class PixDepositService {
    public Receipt efutuarDeposito(Card cartao, double valorDeposito) {
        // TODO faz cobrança do valor do pix e sua lógica

        if (valorDeposito < Card.VALOR_DEPOSITO_MINIMO) {
            throw new IllegalArgumentException(
                    String.format("Valor de depósito não pode ser menor que %.2f", Card.VALOR_DEPOSITO_MINIMO));
        }

        cartao.saldo += valorDeposito - Card.TARIFA_DEPOSITO;

        return new Receipt(cartao.titular, valorDeposito);
    }
}
