import com.github.eduubraga.Request;

public class Main {
    public static void main(String[] args) {
        Request pedido1 = new Request("eduu");

        pedido1.setStatus(Request.STATUS_ISSUED);
        pedido1.setOrigin(Request.ORIGIN_ONLINE);

        System.out.println(pedido1.getDescriptionStatus(pedido1.getStatus()));
    }
}
