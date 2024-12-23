package com.github.eduubraga;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatClass {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);

        double a = 3_765_987.2556;
        float b = 234.34f;
        int c = -1;
        BigDecimal d = new BigDecimal("456.235");

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        NumberFormat formatter = new DecimalFormat("¤ #,##0.00;¤ #,##0.00", symbols);

//        System.out.println(formatter.format(a));
//        System.out.println(formatter.format(b));
//        System.out.println(formatter.format(c));
//        System.out.println(formatter.format(d));

        // Números compactos
        BigDecimal x = new BigDecimal("2231.25");
        BigDecimal y = new BigDecimal("2231231.25");
        BigDecimal z = new BigDecimal("4321231231.25");

        NumberFormat formatter2 = NumberFormat
                .getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

        System.out.println(formatter2.format(x));
        System.out.println(formatter2.format(y));
        System.out.println(formatter2.format(z));
    }
}
