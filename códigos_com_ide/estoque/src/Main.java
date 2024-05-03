import com.github.eduubraga.stock.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Leite em pó 1KG", new BigDecimal("28.25"), 0));
        products.add(new Product("Café puro 250G", new BigDecimal("7.90"), 20));
        products.add(new Product("Leite de coco menina 200ML",
                new BigDecimal("2.50"), 24, Product.Status.INACTIVE));
        products.add(new Product("Arroz 101 T.1 1KG", new BigDecimal("5.29"), 0));
        products.add(new Product("Macarrão bonsabor 400G", new BigDecimal("2.45"), 14));


        Consumer<Product> consumerClearStock = product -> product.setQuantity(0);
        Consumer<Product> consumerPrintProduct = product -> System.out.println(product);
        products.forEach(consumerClearStock.andThen(consumerPrintProduct));

//        for (Product product : products) {
//            System.out.println(product);
//        }
    }
}
