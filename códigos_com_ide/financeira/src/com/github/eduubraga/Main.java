package com.github.eduubraga;

import com.github.eduubraga.models.FinancialPartner;
import com.github.eduubraga.models.financeablecompanies.Industry;
import com.github.eduubraga.services.FinancingService;

public class Main {
    public static void main(String[] args) {
        FinancingService financingService = new FinancingService();

        Industry industry = new Industry("C Eduardo P B", 100_000, false);

        financingService.requestFinancing(industry, 30_000);

        industry.setComprensatesCo2Emissions(true);

        financingService.requestFinancing(industry, 30_000);

        FinancialPartner financialPartner = new FinancialPartner("hp streetwear", 10_000);
    }
}
