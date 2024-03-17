import com.github.eduubraga.agencia.Hotel;
import com.github.eduubraga.agencia.HotelRegistration;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotelRegistration hotelRegistration = new HotelRegistration();

        hotelRegistration.addHotel("Hotel miami", "miami", 4_000);
        hotelRegistration.addHotel("palace", "pentecoste/ce", 500);
        hotelRegistration.addHotel("Vila mãe rainha", "Pentecoste/CE", 350);
        hotelRegistration.addHotel("Casa lunar", "fortaleza/ce", 900);

//        hotelRegistration.addHotel("Vila mãe rainha", "Pentecoste/CE", 350);

        ArrayList<Hotel> hotels = hotelRegistration.getAll();
        printHotels(hotels);
    }

    public static void printHotels(ArrayList<Hotel> hotels) {
        for (Hotel hotel : hotels) {
            System.out.printf("%s (%s) -> %.2f%n"
                    , hotel.getName(), hotel.getCity(), hotel.getDailyPrice());
        }
    }
}
