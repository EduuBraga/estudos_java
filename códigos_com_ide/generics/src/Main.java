import com.github.eduubraga.sorteio.Client;
import com.github.eduubraga.sorteio.Drawer;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Eduardo", "Vivi", "Sr. Carlos"};

        String nameDrawn = Drawer.draw(names);
        System.out.println("Nome sorteado: " + nameDrawn);

        Client[] clients = {
                new Client("HP", 30_000),
                new Client("VV", 50_000),
                new Client("CE", 80_000)};

        Client clientDrawn = Drawer.draw(clients);
        System.out.println("Cliente sorteado: " + clientDrawn.getReason());
    }
}
