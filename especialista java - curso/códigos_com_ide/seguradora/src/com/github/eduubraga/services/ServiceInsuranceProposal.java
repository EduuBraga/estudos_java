package com.github.eduubraga.services;

import com.github.eduubraga.models.WellInsurable;

public class ServiceInsuranceProposal {

    public void issue(WellInsurable well){
        System.out.println("-------------------");
        System.out.println("Proposta de Seguro");
        System.out.println("-------------------");
        System.out.println(well.toDescribe());
        System.out.printf("Prêmio: R$ %.2f%n", well.calculatePremiumValue());
    }

}
