package com.github.eduubraga.business;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sale {
    private final Integer code;
    private final LocalDate date = LocalDate.now();
    private BigDecimal totalValue = BigDecimal.ZERO;
    private final Client client;
    private final List<Item> items = new ArrayList<>();
    private Status status = Status.DRAFT;

    public Sale(Integer code, Client client) {
        Objects.requireNonNull(code);
        Objects.requireNonNull(client);
        this.code = code;
        this.client = client;
    }

    public Integer getCode() {
        return code;
    }

    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public Client getClient() {
        return client;
    }

    public List<Item> getItems() {
        return items;
    }

    public Status getStatus() {
        return status;
    }

    public boolean isDraft() {
        return status.equals(Status.DRAFT);
    }

    public boolean isInclud() {
        return status.equals(Status.INCLUDED);
    }

    public boolean isCanceled() {
        return status.equals(Status.CANCELED);
    }

    public void addItem(Item item) {
        items.add(item);
        calculateTotalValue();
    }

    public void conclude() {
        status = Status.INCLUDED;
    }

    public void cancel() {
        status = Status.CANCELED;
    }

    private void calculateTotalValue() {
        this.totalValue = items.stream()
                .reduce(BigDecimal.ZERO,
                        (acc, item) -> acc.add(item.calculateTotalValue()),
                        BigDecimal::add);
    }

    public enum Status {
        DRAFT, INCLUDED, CANCELED
    }

    public record Item(String description, int quantity, BigDecimal price) {
        public BigDecimal calculateTotalValue() {
            return price.multiply(new BigDecimal(quantity));
        }

    }

    @Override
    public String toString() {
        return "Sale{" +
                "code=" + code +
                ", date=" + date +
                ", totalValue=" + totalValue +
                ", client=" + client +
                ", items=" + items +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Objects.equals(code, sale.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
