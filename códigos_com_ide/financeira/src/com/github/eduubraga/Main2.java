package com.github.eduubraga;

import com.github.eduubraga.models.BonifiableEntity;
import com.github.eduubraga.models.Employee;
import com.github.eduubraga.models.Seller;
import com.github.eduubraga.services.ServicePaymentBonus;

public class Main2 {
    public static void main(String[] args) {
        ServicePaymentBonus servicePaymentBonus = new ServicePaymentBonus();

        BonifiableEntity silas = new Seller("Oslenilton", 2_750, 130_000);

        servicePaymentBonus.pay(silas, 0.01 );
    }
}
