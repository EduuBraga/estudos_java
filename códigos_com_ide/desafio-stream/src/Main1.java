import com.github.eduubraga.business.Sale;
import com.github.eduubraga.business.SalesService;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        var salesService = new SalesService();
        List<Sale> sales = salesService.getAll();

//        for (Sale sale : sales) {
//            if (sale.isInclud()) {
//                System.out.println(sale);
//            }
//        }

        sales.stream()
                .filter(Sale::isInclud)
                .forEach(System.out::println);
    }
}
