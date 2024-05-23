import com.github.eduubraga.business.Sale;
import com.github.eduubraga.business.SalesService;

import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        var salesService = new SalesService();
        List<Sale> sales = salesService.getAll();

//        int quantityOfItemsSold = 0;
//        for (Sale sale : sales) {
//            if (sale.isInclud()) {
//                for (Sale.Item item : sale.getItems()) {
//                    quantityOfItemsSold += item.quantity();
//                }
//            }
//        }
//
//        System.out.println(quantityOfItemsSold);

        int quantityOfItemsSold = sales.stream()
                .filter(Sale::isInclud)
                .flatMap(sale -> sale.getItems().stream())
                .mapToInt(Sale.Item::quantity)
                .sum();

        System.out.println(quantityOfItemsSold);
    }
}
