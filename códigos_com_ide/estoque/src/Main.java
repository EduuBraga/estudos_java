import com.github.eduubraga.stock.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Leite em pó 1KG", new BigDecimal("28.25"), 0));
        products.add(new Product("Café puro 250G", new BigDecimal("7.90"), 20));
        products.add(new Product("Leite de coco menina 200ML",
                new BigDecimal("2.50"), 24, Product.Status.INACTIVE));
        products.add(new Product("Arroz 101 T.1 1KG", new BigDecimal("5.29"), 0));
        products.add(new Product("Macarrão bonsabor 400G", new BigDecimal("2.45"), 14));

        // Function
        //products.sort((product1, product2) -> Integer.compare(product1.getQuantity(), product2.getQuantity()));

        // products.sort(Comparator.comparing(product -> product.getQuantity()));

        ToIntFunction<Product> compareByQuantity = product -> product.getQuantity();
        Function<Product, String> compareByName = product -> product.getName();

        products.sort(Comparator.comparingInt(compareByQuantity).thenComparing(compareByName));

        products.forEach(product -> System.out.println(product));
    }
}
