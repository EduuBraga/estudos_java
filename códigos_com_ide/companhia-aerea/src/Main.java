import com.github.eduubraga.ciaaerea.Flight;
import com.github.eduubraga.ciaaerea.Reserve;
import com.github.eduubraga.ciaaerea.services.BaggageService;
import com.github.eduubraga.ciaaerea.services.ReserveService;

public class Main {
    public static void main(String[] args) {
        ReserveService reserveService = new ReserveService();
        BaggageService baggageService = new BaggageService(reserveService);

        Flight flight = new Flight("V467D1", "SDU", "UNA");

        reserveService.add(new Reserve("F1122D1", flight, "Eduardo Braga"));
        reserveService.add(new Reserve("F1133D2", flight, "João Fonseca"));
        reserveService.add(new Reserve("F1144D3", flight, "Maria Antonieta"));
        reserveService.add(new Reserve("F1155D4", flight, "ei sei shin"));

        baggageService.contract("F1122D1", 3);

        reserveService.getReserves().forEach(System.out::println);
    }
}
