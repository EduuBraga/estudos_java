import com.github.eduubraga.business.Client;
import com.github.eduubraga.business.Sale;
import com.github.eduubraga.business.SalesService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {
        var salesService = new SalesService();
        List<Sale> sales = salesService.getAll();

//        List<String> clients = new ArrayList<>();
//        for (Sale sale : sales) {
//            if (sale.isInclud()) {
//                if (!clients.contains(sale.getClient().name())) {
//                    clients.add(sale.getClient().name());
//                }
//            }
//        }
//
//        Collections.sort(clients);
//        System.out.println(clients);

        List<String> clients = sales.stream()
                .filter(Sale::isInclud)
                .map(sale -> sale.getClient().name())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(clients);
    }
}
