package com.github.eduubraga.sales;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static NumberFormat FORMATTER_COIN = NumberFormat
            .getCurrencyInstance(new Locale("pt", "BR"));

    public static void main(String[] args) {
        Client eduardo = new Client("Eduardo");
        Order pedido = new Order(eduardo);

        Order.ItemOrder item1 = pedido.addItem("Mouse", new BigDecimal("230"), 2);
        Order.ItemOrder item2 = pedido.addItem("Monitor", new BigDecimal("859.29"), 3);

        printSummary(pedido);

        System.out.println("------");

        item1.setQty(5);
        item2.setQty(4);
        printSummary(pedido);

        System.out.println("------");

        pedido.issue();
        item1.setQty(20);
    }

    private static void printSummary(Order order) {
        for (Order.ItemOrder itemOrder : order.getItemsOrder()) {
            System.out.printf("%s (%s) X %d = %s\n",
                    itemOrder.getDescription(),
                    FORMATTER_COIN.format(itemOrder.getValue()),
                    itemOrder.getQty(),
                    FORMATTER_COIN.format(itemOrder.getValueTotal()));
        }

        System.out.printf("Total pedido: %s\n", FORMATTER_COIN.format(order.getValueTotal()));
    }
}
