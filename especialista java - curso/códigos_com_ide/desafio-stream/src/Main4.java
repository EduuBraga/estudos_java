import com.github.eduubraga.business.Sale;
import com.github.eduubraga.business.SalesService;

import javax.crypto.spec.PSource;
import java.math.BigDecimal;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        var salesService = new SalesService();
        List<Sale> sales = salesService.getAll();

//        BigDecimal totalSales = BigDecimal.ZERO;
//        for (Sale sale : sales) {
//            if (sale.isInclud()) {
//                totalSales = totalSales.add(sale.getTotalValue());
//            }
//        }
//
//        System.out.println(totalSales);

        BigDecimal totalSales = sales.stream()
                .filter(Sale::isInclud)
                .map(Sale::getTotalValue)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(totalSales);
    }
}
