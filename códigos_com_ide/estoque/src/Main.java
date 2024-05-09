import com.github.eduubraga.stock.Category;
import com.github.eduubraga.stock.Product;
import com.github.eduubraga.stock.Supplier;
import com.github.eduubraga.stock.services.ServiceProductInactivation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Supplier supplierCocaCoca = new Supplier("CB DISTRIBUIDORA");
        Supplier supplierBetania = new Supplier("Alvoar Lacteos");
        Supplier supplierAmbev = new Supplier("MC Comercial e Varejista");
        Supplier supplierSG = new Supplier("V Cunha S.G");

        Category categoryDrinks = new Category("Drinks");
        Category categoryDairies = new Category("Dairies");

        products.add(new Product("Coca cola 1L", new BigDecimal("6.00"), 6,
                Product.Status.INACTIVE, supplierCocaCoca, categoryDrinks));
        products.add(new Product("Coca cola 2L", new BigDecimal("10.00"), 6,
                Product.Status.INACTIVE, supplierCocaCoca, categoryDrinks));
        products.add(new Product("Skol 300ML", new BigDecimal("2.50"), 23,
                Product.Status.INACTIVE, supplierAmbev, categoryDrinks));
        products.add(new Product("Skol lata 350ML", new BigDecimal("3.00"), 12,
                Product.Status.INACTIVE, supplierAmbev, categoryDrinks));
        products.add(new Product("Leite condensado betania", new BigDecimal("6.00"), 27,
                Product.Status.INACTIVE, supplierBetania, categoryDairies));
        products.add(new Product("Serra grande 510ml S/G", new BigDecimal("6.00"), 0,
                Product.Status.INACTIVE, supplierSG, categoryDrinks));

        products.stream()
                .filter(Product::haveStock)
                .map(Product::getSupplier)
                .distinct()
                .forEach(System.out::println);
    }
}
