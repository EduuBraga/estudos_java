package com.github.eduubraga;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main2 {
    public static void main(String[] args) {
        BigDecimal y = new BigDecimal("10.00");
        BigDecimal x = new BigDecimal("3.00");

        System.out.println(y.divide(x, 2, RoundingMode.HALF_EVEN));
    }
}
