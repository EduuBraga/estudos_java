package com.github.eduubraga.agencia;

import com.github.eduubraga.agencia.comparators.PriceHotelComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class HotelRegistration {
    private final ArrayList<Hotel> hotels = new ArrayList<>();

    public void addHotel(String name, String city, double dailyPrice) {
        Hotel hotel = new Hotel(name, city, dailyPrice);

        if (hotels.contains(hotel)) {
            throw new ExistingHotelException("Hotel já existente");
        }

        hotels.add(hotel);
    }

    public ArrayList<Hotel> getAll() {
        return hotels;
    }

    public void sort() {
        hotels.sort(Comparator.naturalOrder());
    }

    public void sortByPrice() {
        hotels.sort(new PriceHotelComparator()
                .thenComparing(Comparator.naturalOrder()));
    }

    public void sortByPriceReversed() {
        hotels.sort(new PriceHotelComparator().reversed()
                .thenComparing(Comparator.naturalOrder()));
    }

    public void removeByCity(String city) {
        Iterator<Hotel> hotelIterator = hotels.iterator();

        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();

            if (hotel.getCity().equals(city)) {
                hotelIterator.remove();
            }
        }
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
