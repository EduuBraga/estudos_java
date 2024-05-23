package com.github.eduubraga.impostos;

public abstract class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract double calculateTaxes();
}
