package com.github.eduubraga;

import com.github.eduubraga.impostos.PhysicalPerson;

public class Main {
    public static void main(String[] args) {
        var eduardo = new PhysicalPerson("Carlos Eduardo", 60_600);
        var roberto = new PhysicalPerson("robertinho", 31_800);

        System.out.println(eduardo.calculateTaxes());
        System.out.println(roberto.calculateTaxes());
    }
}
