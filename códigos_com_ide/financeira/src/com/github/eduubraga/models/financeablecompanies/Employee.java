package com.github.eduubraga.models.financeablecompanies;

public class Employee extends FinanceableCompany{
    public static final int QUANTITY_SALARY_LIMIT_CREDIT = 4;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        super(name, 0);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateApprovedLimit() {
        return getMonthlySalary() * QUANTITY_SALARY_LIMIT_CREDIT;
    }
}
