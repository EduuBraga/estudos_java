package com.github.eduubraga.sales;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Order {
    private final Client client;
    private ArrayList<ItemOrder> itemsOrder = new ArrayList<>();
    private static Status status = Status.BUDGET;

    public Order(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public ArrayList<ItemOrder> getItemsOrder() {
        return itemsOrder;
    }

    private void setStatus(Status status) {
        Order.status = status;
    }

    public void issue(){
        setStatus(Status.ISSUED);
    }

    public void invoice(){
        setStatus(Status.INVOICED);
    }

    public ItemOrder addItem(String description, BigDecimal value, int qty) {
        ItemOrder itemOrder = new ItemOrder(description, value, qty);

        itemsOrder.add(itemOrder);

        return itemOrder;
    }

    private enum Status {
        BUDGET, ISSUED, INVOICED
    }

    public BigDecimal getValueTotal(){
        BigDecimal result = BigDecimal.ZERO;

        for (ItemOrder itemOrder : itemsOrder) {
            result = result.add(itemOrder.getValueTotal());
        }

        return result;
    }

    public static class ItemOrder {
        private final String description;
        private final BigDecimal value;
        private int qty;

        public ItemOrder(String description, BigDecimal value, int qty) {
            this.description = description;
            this.value = value;
            this.qty = qty;
        }

        public String getDescription() {
            return description;
        }

        public BigDecimal getValue() {
            return value;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            if (status.equals(Status.INVOICED) || status.equals(Status.ISSUED)){
                throw new IllegalStateException("Pedido não pode ser alterado, já está emitido ou faturado.");
            }

            this.qty = qty;
        }

        public BigDecimal getValueTotal(){
            return value.multiply(new BigDecimal(qty));
        }

        @Override
        public String toString() {
            return "ItemOrder{" +
                    "description='" + description + '\'' +
                    ", value=" + value +
                    ", qty=" + qty +
                    '}';
        }
    }
}
