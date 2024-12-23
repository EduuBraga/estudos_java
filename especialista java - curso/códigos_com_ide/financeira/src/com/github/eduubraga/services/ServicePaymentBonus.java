package com.github.eduubraga.services;

import com.github.eduubraga.models.BonifiableEntity;

public class ServicePaymentBonus {

    public void pay(BonifiableEntity entity, double percentage) {
        double valueBonus = entity.calculateBonus(percentage);

        // iria fazer o pagamento e salvar dados em um banco de dados...

        System.out.printf("DEBUG: Pagamento de bônus efetuado no valor de R$ %.2f", valueBonus);
    }

}
