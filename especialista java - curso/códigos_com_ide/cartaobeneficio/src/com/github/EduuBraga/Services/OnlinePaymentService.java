package com.github.EduuBraga.Services;

import com.github.EduuBraga.Card;
import com.github.EduuBraga.Establishment;
import com.github.EduuBraga.Receipt;

public class OnlinePaymentService {
    public Receipt efetuarPagamento(Establishment estabelecimento, Card cartao, double valor) {
        cartao.debitar(valor);

        // TODO realiza outras lógicas para pagar o estabelecimento.

        return new Receipt(cartao.getTitular(), valor);
    }
}
