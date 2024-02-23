import com.github.eduubraga.agencia.Hotel;
import com.github.eduubraga.agencia.HotelRegistration;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotelRegistration hotelRegistration = new HotelRegistration();

        hotelRegistration.addHotel("Hotel miami" , "miami" , 4_000);
        hotelRegistration.addHotel("palace" , "pentecoste/ce" , 500);
        hotelRegistration.addHotel("Casa lunar" , "fortaleza/ce" , 900);

        ArrayList hotels = hotelRegistration.getAll();
        printHotels(hotels);
    }

    public static void printHotels(ArrayList hotels) {
        for (Object hotelCurrent : hotels) {
            Hotel hotel = (Hotel) hotelCurrent;
            System.out.printf("%s (%s) -> %.2f%n" , hotel.getName(), hotel.getCity(), hotel.getDailyPrice());
        }

//        for (int i = 0; i < hotels.size(); i++) {
//            Hotel hotel = (Hotel) hotels.get(i);
//            System.out.printf("%s (%s) -> %.2f%n", hotel.getName(), hotel.getCity(), hotel.getDailyPrice());
//        }
    }
}
