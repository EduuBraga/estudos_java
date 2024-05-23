package com.github.eduubraga.rentalcompany;

public class SafeBankSantander implements Safe{
    @Override
    public double calcPremium(double hoursUsed, double contractValue) {
        return (hoursUsed * 0.70) + (contractValue * 0.05);
    }
}
