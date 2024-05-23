package com.github.eduubraga.foreignpurchase;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do produto em Dólares? ");
        String responseValueDollar = scanner.next();
        BigDecimal productValueDollars = convertStringBigDecimal(responseValueDollar, CoinType.DOLLAR);

        System.out.print("Valor do dolar em Real? ");
        String responseValueReal = scanner.next();
        BigDecimal dollarValueInReal = convertStringBigDecimal(responseValueReal, CoinType.REAL);

        BigDecimal calcResult = dollarValueInReal.multiply(productValueDollars);

        NumberFormat formatterReal = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.printf("Valor do produto em Reais: %s", formatterReal.format(calcResult));
    }

    static BigDecimal convertStringBigDecimal(String textNumber, CoinType coin) throws ParseException {
        Locale locale = new Locale("pt", "BR");

        if (coin.equals(CoinType.DOLLAR)) {
            locale = Locale.US;
        }

        DecimalFormat formatter = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        formatter.setParseBigDecimal(true);

        return (BigDecimal) formatter.parse(textNumber);
    }
}
