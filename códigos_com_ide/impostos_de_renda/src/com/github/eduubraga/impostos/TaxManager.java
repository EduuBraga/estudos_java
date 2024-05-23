package com.github.eduubraga.impostos;

public class TaxManager {
    private double totalTaxAmount;

    public void add(Person... people){
        for (Person person : people) {
            totalTaxAmount += person.calculateTaxes();
        }
    }

    public double getTotalTaxAmount(){
        return totalTaxAmount;
    }
}
