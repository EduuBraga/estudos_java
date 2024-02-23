package com.github.eduubraga.agencia;

import java.util.ArrayList;

public class HotelRegistration {
    private final ArrayList hotels = new ArrayList();

    public void addHotel(String name, String city, double dailyPrice) {
        hotels.add(new Hotel(name, city, dailyPrice));
    }

    public ArrayList getAll(){
        return hotels;
    }
}
