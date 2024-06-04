package com.github.eduubraga.bank;

import com.github.eduubraga.bank.business.CurrentAccount;
import com.github.eduubraga.bank.business.Holder;
import com.github.eduubraga.bank.business.InsufficientFundsException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.BigDecimal;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        var holder1 = new Holder("Eduardo Braga", "12345612399");
        var account = new CurrentAccount(holder1, 999, 3000);

        logger.debug("Manipulando conta...");

        try {
            account.deposit(new BigDecimal("3000"));
            account.withdath(new BigDecimal("0"));
        } catch (InsufficientFundsException exception) {
            logger.warn("Sem saldo suficiente para continuar a operação da conta {}/{}",
                    account.getAgency(), account.getNumber(), exception);
        } catch (Exception exception) {
            logger.error("Erro na manipulação das operações da conta {}/{}",
                    account.getAgency(), account.getNumber(), exception);
        }
    }
}
