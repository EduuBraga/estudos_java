package com.github.eduubraga.models;

public class Employee implements BankableClient {

    public static final int QUANTITY_SALARY_LIMIT_CREDIT = 4;

    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double calculateApprovedLimit() {
        return getMonthlySalary() * QUANTITY_SALARY_LIMIT_CREDIT;
    }

}
