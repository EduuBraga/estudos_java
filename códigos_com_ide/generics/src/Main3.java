import com.github.eduubraga.estruturadedados.*;

public class Main3 {
    public static void main(String[] args) {
        Row<Product> products = new Row<>();

        products.toPlace(new Product("Oleo soya 900ML", 6.85));
        products.toPlace(new Product("Arroz vo olimpio C/10", 55.90));
        products.toPlace(new Product("Cafe Santa c. Almof. 250g C/10", 78.10));

        removeAll(products);
    }

    public static void removeAll(MyCollection<Product> products) {
        try {
            int counter = 1;

            while (true) {
                Product itemRemoved = products.toRemove();
                System.out.printf("%d. %s%n", counter, itemRemoved.getName());
                counter++;
            }
        } catch (EmptyStackException e) {
            System.out.println("Coleção vazia.");
        }
    }
}
