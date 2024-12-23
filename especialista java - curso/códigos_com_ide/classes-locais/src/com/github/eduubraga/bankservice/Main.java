package com.github.eduubraga.bankservice;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(new BigDecimal("1000"));
        System.out.printf("Saldo inicial: %.2f\n", account.getBalance());

        Transaction transaction1 = account.makePayment(new BigDecimal("100"));
        Transaction transaction2 = account.chargeAFee(new BigDecimal("10"));

        System.out.printf("Pagamento: R$ %.2f\n", transaction1.getValueTotal());
        System.out.printf("Tarifa: R$ %.2f\n", transaction2.getValueTotal());

        transaction2.reimbursement();
        System.out.printf("Reembolso: %.2f\n", transaction2.getValueTotal());

        System.out.printf("Saldo: %.2f\n", account.getBalance());
    }
}
