package com.github.eduubraga.rentalcompany;

public class PricingPerDay implements Pricing {
    @Override
    public double calculate(Notebook notebook, int hoursUsed) {
        double daysUsed = Math.ceil(hoursUsed / 24d);
        return notebook.getPriceDay() * daysUsed;
    }
}
