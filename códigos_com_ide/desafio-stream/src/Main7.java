import com.github.eduubraga.business.Sale;
import com.github.eduubraga.business.SalesService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main7 {
    public static void main(String[] args) {
        var salesService = new SalesService();
        List<Sale> sales = salesService.getAll();

//        Map<String, Long> salesMadeByCustomer = new HashMap<>();
//        for (Sale sale : sales) {
//            if (sale.isInclud()) {
//                String nameClient = sale.getClient().name();
//                Long soldAmount = salesMadeByCustomer.get(nameClient);
//                if (soldAmount == null) {
//                    soldAmount = 0L;
//                }
//
//                salesMadeByCustomer.put(nameClient, soldAmount + 1);
//            }
//        }
//
//        System.out.println(salesMadeByCustomer);

        Map<String, Long> saleMadeByCustomerCorrect = sales.stream()
                .filter(Sale::isInclud)
                .collect(Collectors.groupingBy(sale -> sale.getClient().name(),
                        Collectors.counting()));

        System.out.println(saleMadeByCustomerCorrect);
    }
}
