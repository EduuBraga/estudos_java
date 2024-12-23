package com.github.eduubraga.rentalcompany;

public class PricingPerHour implements  Pricing{
    @Override
    public double calculate(Notebook notebook, int hoursUsed) {
        return notebook.getPriceHour() * hoursUsed;
    }
}
