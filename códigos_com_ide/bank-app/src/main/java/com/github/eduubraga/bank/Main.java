package com.github.eduubraga.bank;

import com.github.eduubraga.bank.business.CurrentAccount;
import com.github.eduubraga.bank.business.Holder;
import com.github.eduubraga.bank.business.InsufficientFundsException;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var holder1 = new Holder("Eduardo Braga", "12345612399");
        var account = new CurrentAccount(holder1, 999, 3000);

        logger.fine("Manipulando conta...");
        try {
            account.deposit(new BigDecimal("3000"));
            account.withdath(new BigDecimal("-1"));
        } catch (InsufficientFundsException exception) {
            logger.log(Level.WARNING, String.format("Sem saldo suficiente para continuar a operação da conta %s",
                    account.getAgency() + "/" + account.getNumber()), exception);
        } catch (Exception exception) {
            logger.log(Level.SEVERE, String.format("Erro na manipulação das operações da conta %s",
                    account.getAgency() + "/" + account.getNumber()), exception);
        }
    }
}
