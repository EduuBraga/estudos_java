import com.github.eduubraga.business.Sale;
import com.github.eduubraga.business.SalesService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        var salesService = new SalesService();
        List<Sale> sales = salesService.getAll();

//        List<String> descriptions = new ArrayList<>();
//        for (Sale sale : sales) {
//            if (sale.isInclud()) {
//                for (Sale.Item item : sale.getItems()) {
//                    if (!descriptions.contains(item.description())) {
//                        descriptions.add(item.description());
//                    }
//                }
//            }
//        }
//
//        Collections.sort(descriptions);
//
//        for (String description : descriptions) {
//            System.out.println(description);
//        }

        List<String> desc = sales.stream()
                .filter(Sale::isInclud)
                .flatMap(sale -> sale.getItems().stream())
                .map(Sale.Item::description)
                .distinct()
                .toList();

        desc.forEach(System.out::println);
    }
}
