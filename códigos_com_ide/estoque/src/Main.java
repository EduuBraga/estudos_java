import com.github.eduubraga.stock.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
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


        // Maneira sem expressão lambda
//        Iterator<Product> productIterator = products.iterator();
//        while(productIterator.hasNext()) {
//            Product productCurrent = productIterator.next();
//
//            if (productCurrent.getQuantity() < 1 || productCurrent.getStatus().equals(Product.Status.INACTIVE)) {
//                productIterator.remove();
//            }
//        }

        Predicate<Product> predicateOutOfStock = product -> product.getQuantity() < 1;
        Predicate<Product> predicateInactiveProducts = product -> product.getStatus().equals(Product.Status.INACTIVE);

        products.removeIf(predicateOutOfStock.or(predicateInactiveProducts));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
