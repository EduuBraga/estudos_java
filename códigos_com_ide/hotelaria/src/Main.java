import com.github.eduubraga.agencia.Hotel;
import com.github.eduubraga.agencia.HotelRegistration;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HotelRegistration hotelRegistration = new HotelRegistration();

        hotelRegistration.addHotel("Hotel miami", "miami", 4_000);
        hotelRegistration.addHotel("Palace", "Pentecoste/CE", 500);
        hotelRegistration.addHotel("Casa lunar", "fortaleza/ce", 900);
        hotelRegistration.addHotel("Vila mãe rainha", "Pentecoste/CE", 900);
        hotelRegistration.addHotel("Hotel frio da costa", "fortaleza/ce", 900);

        ArrayList<Hotel> hotels = hotelRegistration.getAll();

        hotelRegistration.sortByPrice();
        printHotels(hotels);
    }

    public static void printHotels(ArrayList<Hotel> hotels) {
        Iterator<Hotel> hotelIterator = hotels.iterator();
        int i = 1;

        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();

            System.out.printf("%d. %s (%s) -> %.2f%n"
                    , i, hotel.getName(), hotel.getCity(), hotel.getDailyPrice());
            i++;
        }
    }
}
