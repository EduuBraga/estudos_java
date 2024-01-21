package com.github.eduubraga;

import com.github.eduubraga.impostos.CompanyRealProfit;
import com.github.eduubraga.impostos.PhysicalPerson;
import com.github.eduubraga.impostos.SimpleCompany;

public class Main {
    public static void main(String[] args) {
        var eduardo = new PhysicalPerson("Carlos Eduardo", 60_600);
        var roberto = new PhysicalPerson("robertinho", 31_800);

        var hp = new SimpleCompany("HP streethear", 240_000, 200_000);
        var mc = new CompanyRealProfit("MC", 3_000_000, 2_640_000);

        System.out.println(hp.calculateTaxes());
        System.out.println(mc.calculateTaxes());
    }
}
