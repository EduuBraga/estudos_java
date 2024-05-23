package com.github.eduubraga.crm;

public class Employee implements Nameable {
    private String name;
    private Double wage;

    public Employee(String name, Double wage) {
        this.name = name;
        this.wage = wage;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }
}
