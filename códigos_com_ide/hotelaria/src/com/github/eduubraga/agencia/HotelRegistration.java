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

    public void removeByCity(String city) {
        ArrayList<Hotel> hotelsRemoved = new ArrayList<>();

        for (Hotel hotel : hotels) {
            if (hotel.getCity().equals(city)) {
                hotelsRemoved.add(hotel);
            }
        }

        hotels.removeAll(hotelsRemoved);
    }

    public void remove(Hotel hotel) {
        boolean removed = hotels.remove(hotel);

        if (!removed) {
            throw new HotelNotFoundException("Hotel não encontrado para remoção");
        }
    }

    public void removeAll() {
        hotels.clear();
    }
}
