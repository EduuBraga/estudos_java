import com.github.eduubraga.Request;
import com.github.eduubraga.RequestStatus;

public class Main {
    public static void main(String[] args) {
        Request pedido = new Request("eduu");

        pedido.setStatus(RequestStatus.INVOICED);

        System.out.println(pedido.getStatus());
    }
}
