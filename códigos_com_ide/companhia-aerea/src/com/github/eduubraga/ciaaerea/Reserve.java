package com.github.eduubraga.ciaaerea;

import java.util.Objects;

public class Reserve {
    private final String code;
    private final Passenger passenger;
    private final Flight flight;
    private int baggageQuantity;

    public Reserve(String code, Flight flight, String namePassenger) {
        Objects.requireNonNull(code);
        Objects.requireNonNull(flight);
        Objects.requireNonNull(namePassenger);
        this.code = code;
        this.flight = flight;
        this.passenger = new Passenger(namePassenger);
    }

    public String getCode() {
        return code;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getNamePassenger() {
        return getPassenger().getName();
    }

    public Flight getFlight() {
        return flight;
    }

    public int getBaggageQuantity() {
        return baggageQuantity;
    }

    public void addBaggage(int qty) {
        this.baggageQuantity += qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserve that = (Reserve) o;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return """
                Reservantion{code="%s", flight=%s(%s-%s), baggageQuantity="%d", passenger="%s"}"""
                .formatted(getCode(), getFlight().code(), getFlight().origin(),
                        getFlight().destiny(), getBaggageQuantity(), getNamePassenger());
    }
}
