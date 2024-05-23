import com.github.eduubraga.stock.Category;
import com.github.eduubraga.stock.Product;
import com.github.eduubraga.stock.Supplier;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
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

//        int resultTotalQuantityProducts = products.stream()
//                .filter(Product::haveStock)
//                .map(Product::getQuantity)
//                .reduce(0, Integer::sum);
//
//        System.out.println(resultTotalQuantityProducts);
//
//        String names = products.stream()
//                .map(Product::getName)
//                .reduce("Nomes:", (sub, valueCurrent) -> "%s %s, ".formatted(sub, valueCurrent));
//
//        System.out.println(names);

        // --- Reduce com BigDecimal & funcão combinação
//        BigDecimal valuesProducts = products.stream()
//                .map(product -> product.getPrice().multiply(new BigDecimal(product.getQuantity())))
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
//
//        System.out.println(valuesProducts);

//        BigDecimal valuesProducts = products.stream()
//                .reduce(BigDecimal.ZERO, (sub, product) -> {
//                    BigDecimal valueStockProduct = product.getPrice().multiply(new BigDecimal(product.getQuantity()));
//                    return sub.add(valueStockProduct);
//                }, BigDecimal::add);
//
//        System.out.println(valuesProducts);

        // --- Reduce retornando um Optinal
//        ArrayList<Product> products1 = new ArrayList<>();
//
//        OptionalInt bigQuantityOptional = products1.stream()
//                        .mapToInt(Product::getQuantity)
//                .reduce(Integer::max);
//
//        int bigQuantity = bigQuantityOptional.orElseThrow(() -> new RuntimeException("Nenhum produto com estoque"));
//
//        System.out.println(bigQuantity);

//        Optional<BigDecimal> bigPriceOptional = products.stream()
//                .map(Product::getPrice)
//                .reduce((num1, num2) -> BigDecimal.valueOf(Math.max(num1.intValue(), num2.intValue())));
//
//        BigDecimal bigPrice = bigPriceOptional.orElseThrow(() -> new RuntimeException("Nenhum produto encontrado"));
//
//        System.out.println(bigPrice);

        // --- Operação de Reduce especiais
//        int resultSumQunatityStock = products.stream()
//                .mapToInt(Product::getQuantity)
//                .sum();
//
//        System.out.println(resultSumQunatityStock);
//
//        double averageStockProducts = products.stream().
//                mapToInt(Product::getQuantity)
//                .average()
//                .orElseThrow(() -> new RuntimeException("Nenhum produto encontrado"));
//
//        System.out.println(averageStockProducts);
//
//        long productsInStock = products.stream()
//                .filter(Product::haveStock)
//                .count();
//
//        System.out.println(productsInStock);
//
//        int productWithTheMostStock  = products.stream()
//                .filter(Product::haveStock)
//                .mapToInt(Product::getQuantity)
//                .max()
//                .orElseThrow(() -> new RuntimeException("Nenhum produto encontrado"));
//
//        System.out.println(productWithTheMostStock);
//
//        Product cheapestProduct = products.stream()
//                .filter(Product::haveStock)
//                .min(Comparator.comparing(Product::getPrice))
//                .orElseThrow(() -> new RuntimeException("Nenhum produto encontrado"));
//
//        System.out.println(cheapestProduct);


        // --- Collect
//        List<Category> categories = products.stream()
//                .flatMap(product -> product.getCategories().stream())
//                .distinct()
//                .collect(() -> new ArrayList<>(),
//                        (list, element) -> list.add(element),
//                        (list1, list2) -> list1.addAll(list2));
//
//        categories.forEach(category -> System.out.println(category.name()));
//
//        List<BigDecimal> prices = products.stream()
//                .map(Product::getPrice)
//                .collect(ArrayList::new,
//                        ArrayList::add,
//                        ArrayList::addAll);
//
//        System.out.println(prices);

        // --- Coletores padrões
//        List<Category> categories = products.stream()
//                .flatMap(product -> product.getCategories().stream())
//                .distinct()
//                .collect(Collectors.toCollection(ArrayList::new));
//                .collect(Collectors.toList());
//
//        System.out.println(categories);
//
//        List<String> names = products.stream()
//                .map(Product::getName)
//                .toList();
//                .collect(Collectors.toUnmodifiableList());
//
//        System.out.println(names);

        // --- Coletando em mapas
//        Map<String, Integer> stockMap = products.stream()
//                .filter(Product::haveStock)
//                .collect(Collectors.toMap(Product::getName, Product::getQuantity));
//
//        System.out.println(stockMap);

        // --- Coletando e agrupando
//        Map<Supplier, List<Product>> productsBySupplier = products.stream()
//                .filter(Product::haveStock)
//                .collect(Collectors.groupingBy(Product::getSupplier));
//
//        productsBySupplier.forEach((supplier, productsSupplier) -> {
//            System.out.println(supplier.name());
//            System.out.println("---------------------------");
//            productsSupplier.forEach(product -> System.out.println(product.getName()));
//            System.out.println();
//        });

        // Collectors.groupingBy()
//        Map<String, Long> productsBySupplier = products.stream()
//                .filter(Product::haveStock)
//                .collect(Collectors.groupingBy(
//                        product -> product.getSupplier().name(), Collectors.counting()));
//
//        System.out.println(productsBySupplier);
//
//        Map<String, Integer> productInventoryBySupplier = products.stream()
//                .filter(Product::haveStock)
//                .collect(Collectors.groupingBy(
//                        product -> product.getSupplier().name(),
//                        Collectors.summingInt(Product::getQuantity)));
//
//        System.out.println(productInventoryBySupplier);

        // --- Collectors.partitioningBy()
        Map<Boolean, List<Product>> productsInStock = products.stream()
                .collect(Collectors.partitioningBy(Product::haveStock));

        productsInStock.forEach((key, productsValue) -> {
            System.out.println(key);
            System.out.println("--------------------------------");
            productsValue.forEach(product -> System.out.println(product.getName()));
            System.out.println();
        });
    }

}