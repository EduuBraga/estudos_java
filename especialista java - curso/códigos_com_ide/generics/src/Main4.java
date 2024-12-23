import com.github.eduubraga.gerenciadorestoque.Car;
import com.github.eduubraga.gerenciadorestoque.InvetoryManager;
import com.github.eduubraga.gerenciadorestoque.Shirt;

public class Main4 {
    public static void main(String[] args) {
        InvetoryManager<Car> carInventory = new InvetoryManager<>();
        carInventory.add(new Car("Onix LT", 2));
//        carInventory.add(new Shirt("Oversized DLT", 8));
        carInventory.add(new Car("Honda fiat UNO", 1));
        System.out.println(carInventory.getTotalStockQuantity());
    }
}
