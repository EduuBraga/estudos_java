package com.github.eduubraga;

import com.github.eduubraga.models.Employee;
import com.github.eduubraga.models.Farm;
import com.github.eduubraga.models.Industry;
import com.github.eduubraga.models.RetailStore;
import com.github.eduubraga.services.FinancingService;

public class Main {

    public static void main(String[] args) {
        FinancingService financingService = new FinancingService();

        Industry industry = new Industry("C Eduardo P B", 100_000, false);
        Farm farm = new Farm("Fazenda belem", 700_000, 5);
        RetailStore retailStore = new RetailStore("HP streetwear", 300_000, 100_000);
        Employee employee = new Employee("Eduardo", 2_000);

        financingService.requestFinancing(industry, 30_000);
        financingService.requestFinancing(farm, 300_000);
        financingService.requestFinancing(retailStore, 100_000);
        financingService.requestFinancing(employee, 5_500);
    }

}
