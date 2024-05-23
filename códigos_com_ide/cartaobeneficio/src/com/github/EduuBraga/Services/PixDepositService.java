package com.github.EduuBraga.Services;

import com.github.EduuBraga.Card;
import com.github.EduuBraga.Receipt;

public class PixDepositService {
    public Receipt efutuarDeposito(Card cartao, double valorDeposito) {
        // TODO faz cobrança do valor do pix e sua lógica

        cartao.creditar(valorDeposito);

        return new Receipt(cartao.getTitular(), valorDeposito);
    }
}
