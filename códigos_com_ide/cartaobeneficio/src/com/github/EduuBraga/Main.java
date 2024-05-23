package com.github.EduuBraga;

import com.github.EduuBraga.Services.OnlinePaymentService;
import com.github.EduuBraga.Services.PixDepositService;

public class Main {
    public static void main(String[] args) {
        Card cartaoEdu = new Card("Carlos Eduardo");
        Establishment hpstreetwear = new Establishment("HP Streetwear");

        PixDepositService servicoDepositoPix = new PixDepositService();
        OnlinePaymentService servicoPagamentoOnline = new OnlinePaymentService();

        Receipt reciboDeposito = servicoDepositoPix.efutuarDeposito(cartaoEdu, 500);
        reciboDeposito.imprimirDescricaoDeposito();

        Receipt reciboPagamento = servicoPagamentoOnline.efetuarPagamento(hpstreetwear, cartaoEdu, 100);
        reciboPagamento.imprimirDescricaoTransacao();

        System.out.printf("Titular: %s%n", cartaoEdu.getTitular());
        System.out.printf("Saldo: %.2f%n", cartaoEdu.getSaldo());
    }
}
