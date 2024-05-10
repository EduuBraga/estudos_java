import com.github.eduubraga.stock.Category;
import com.github.eduubraga.stock.Product;
import com.github.eduubraga.stock.Supplier;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Supplier supplierCocaCoca = new Supplier("CB DISTRIBUIDORA");
        Supplier supplierBetania = new Supplier("Alvoar Lacteos");
        Supplier supplierAmbev = new Supplier("MC Comercial e Varejista");
        Supplier supplierSG = new Supplier("V Cunha S.G");

        Category categoryDrinks = new Category("Drinks");
        Category categoryDairies = new Category("Dairies");
        Category categoryDisposable = new Category("Others");

        products.add(new Product("Coca cola 1L", new BigDecimal("6.00"), 6,
                Product.Status.INACTIVE, supplierCocaCoca, categoryDrinks, categoryDisposable));
        products.add(new Product("Coca cola 2L", new BigDecimal("10.00"), 6,
                Product.Status.INACTIVE, supplierCocaCoca, categoryDrinks, categoryDisposable));
        products.add(new Product("Skol 300ML", new BigDecimal("2.50"), 23,
                Product.Status.INACTIVE, supplierAmbev, categoryDrinks));
        products.add(new Product("Skol lata 350ML", new BigDecimal("3.00"), 12,
                Product.Status.INACTIVE, supplierAmbev, categoryDrinks));
        products.add(new Product("Leite condensado betania", new BigDecimal("6.00"), 27,
                Product.Status.INACTIVE, supplierBetania, categoryDairies));
        products.add(new Product("Serra grande 510ml S/G", new BigDecimal("6.00"), 0,
                Product.Status.INACTIVE, supplierSG, categoryDrinks));

        // --- flatMap
//        products.stream()
//                .filter(Product::haveStock)
//                .flatMap(product -> product.getCategories().stream())
//                .distinct()
//                .forEach(System.out::println);

        // --- IntStream
//        IntStream intStream = products.stream()
//                .filter(Product::haveStock)
//                .mapToInt(Product::getQuantity);
//
//        intStream.sorted()
//                .forEach(num -> System.out.println(num * 2));

        // --- Reduce
//        IntBinaryOperator operator = (subValue, value) -> {
//            System.out.printf("%d + %d%n", subValue, value);
//            return subValue + value;
//        };
//
//        int resultTotalQuantityProducts = products.stream()
//                .mapToInt(Product::getQuantity)
//                .reduce(0, operator);
//
//        System.out.println(resultTotalQuantityProducts);

        int resultTotalQuantityProducts = products.stream()
                .filter(Product::haveStock)
                .map(Product::getQuantity)
                .reduce(0, Integer::sum);

        System.out.println(resultTotalQuantityProducts);

        String names = products.stream()
                .map(Product::getName)
                .reduce("Nomes:", (sub, valueCurrent) -> "%s %s, ".formatted(sub, valueCurrent));

        System.out.println(names);
    }

}