package com.github.eduubraga;

import com.github.eduubraga.models.PrivateCar;
import com.github.eduubraga.models.ResidentialProperty;
import com.github.eduubraga.models.Truck;
import com.github.eduubraga.services.ServiceInsuranceProposal;

public class Main {
    public static void main(String[] args) {
        ServiceInsuranceProposal serviceInsuranceProposal = new ServiceInsuranceProposal();

        var onix = new PrivateCar("onix", 60_000, 2013);
        var scaniaR440 = new Truck("Scania", 375_000, 2014, 4);
        var terreno = new ResidentialProperty(75_000, 30);

        serviceInsuranceProposal.issue(onix);
        serviceInsuranceProposal.issue(scaniaR440);
        serviceInsuranceProposal.issue(terreno);
     }
}