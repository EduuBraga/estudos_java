package com.github.eduubraga.models;

public class Seller extends Employee{

    private static final double QUANTITY_SALARY_LIMIT_CREDIT = 4;

    private double monthlySale;

    public Seller(String name, double monthlySalary, double monthlySale) {
        super(name, monthlySalary);
        this.monthlySale = monthlySale;
    }

    public double getMonthlySale() {
        return monthlySale;
    }

    public void setMonthlySale(double monthlySale) {
        this.monthlySale = monthlySale;
    }



    @Override
    public double calculateApprovedLimit() {
        return getMonthlySale() * QUANTITY_SALARY_LIMIT_CREDIT;
    }

    @Override
    public double calculateBonus(double percentage) {
        return getMonthlySale() * percentage;
    }
}
