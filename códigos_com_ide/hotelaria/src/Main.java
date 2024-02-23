import com.github.eduubraga.agencia.Hotel;
import com.github.eduubraga.agencia.HotelRegistration;

public class Main {
    public static void main(String[] args) {
        HotelRegistration hotelRegistration = new HotelRegistration();

        hotelRegistration.addHotel("Hotel miami", "miami", 4_000);
        hotelRegistration.addHotel("palace", "pentecoste/ce", 500);
        hotelRegistration.addHotel("Casa lunar", "fortaleza/ce", 900);

        System.out.println(hotelRegistration.getAll());

        Hotel palace = (Hotel) hotelRegistration.getAll().get(1);

        System.out.println(palace.getName());
    }
}
