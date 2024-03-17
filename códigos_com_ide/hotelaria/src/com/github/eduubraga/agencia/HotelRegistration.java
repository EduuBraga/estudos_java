package com.github.eduubraga.agencia;

import java.util.ArrayList;

public class HotelRegistration {
    private final ArrayList<Hotel> hotels = new ArrayList<>();

    public void addHotel(String name, String city, double dailyPrice) {
        Hotel hotel = new Hotel(name, city, dailyPrice);

        if (hotels.contains(hotel)) {
            throw new ExistingHotelException("Hotel já existente");
        }

        hotels.add(hotel);
    }

    public ArrayList<Hotel> getAll(){
        return hotels;
    }
}
