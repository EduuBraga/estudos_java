package com.github.eduubraga;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class Main3 {
    public static void main(String[] args) throws ParseException {
        String textNumber = "1.000,45";

        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        formatter.setParseBigDecimal(true);

        BigDecimal conversion = (BigDecimal) formatter.parse(textNumber);
        conversion = conversion.add(new BigDecimal("1000"));

        System.out.println(conversion);
    }
}
