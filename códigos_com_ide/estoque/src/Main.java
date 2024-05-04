import com.github.eduubraga.stock.Product;
import com.github.eduubraga.stock.services.ServiceProductInactivation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Leite em pó 1KG", new BigDecimal("28.25"), 0));
        products.add(new Product("Café puro 250G", new BigDecimal("7.90"), 20));
        products.add(new Product("Leite de coco menina 200ML",
                new BigDecimal("2.50"), 24, Product.Status.INACTIVE));
        products.add(new Product("Arroz 101 T.1 1KG", new BigDecimal("5.29"), 0));
        products.add(new Product("Macarrão bonsabor 400G", new BigDecimal("2.45"), 14));

        ServiceProductInactivation serviceInactivation = new ServiceProductInactivation();

//        products.forEach(product ->  serviceInactivation.process(product));
        products.forEach(serviceInactivation::process);

        products.forEach(System.out::println);
    }
}
