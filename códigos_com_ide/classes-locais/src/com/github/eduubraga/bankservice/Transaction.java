package com.github.eduubraga.bankservice;

import java.math.BigDecimal;

public interface Transaction {
    BigDecimal getValueTotal();

    void reimbursement();
}
