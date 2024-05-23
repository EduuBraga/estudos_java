package com.github.eduubraga.agencia.comparators;

import com.github.eduubraga.agencia.Hotel;
import java.util.Comparator;

public class PriceHotelComparator implements Comparator<Hotel> {

    @Override
    public int compare(Hotel hotel1, Hotel hotel2) {
        return Double.compare(hotel1.getDailyPrice(), hotel2.getDailyPrice());
    }

}
