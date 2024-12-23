import com.github.eduubraga.business.Client;
import com.github.eduubraga.business.Sale;
import com.github.eduubraga.business.SalesService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        var salesService = new SalesService();
        List<Sale> sales = salesService.getAll();

//        List<Client> clients = new ArrayList<>();
//        for (Sale sale : sales) {
//            if (sale.isInclud() && !clients.contains(sale.getClient())) {
//                clients.add(sale.getClient());
//            }
//        }
//        clients.sort(Comparator.comparing(Client::name));
//
//        for (Client client : clients) {
//            System.out.println(client);
//        }

        List<Client> clients = sales.stream()
                .filter(Sale::isInclud)
                .map(Sale::getClient)
                .distinct()
                .sorted(Comparator.comparing(Client::name))
                .toList();

        clients.forEach(System.out::println);
    }
}
