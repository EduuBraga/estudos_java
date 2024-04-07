import com.github.eduubraga.Request;
import com.github.eduubraga.RequestStatus;

public class Main {
    public static void main(String[] args) {
//        Request pedido = new Request("eduu");
//
//        pedido.setStatus(RequestStatus.INVOICED);
//
//        System.out.println(pedido.getStatus());

        System.out.println(RequestStatus.INVOICED.ordinal());
        System.out.println(RequestStatus.INVOICED.name());

        for (RequestStatus status : RequestStatus.values()) {
            System.out.printf("%d - %s%n", status.ordinal(), status.name());
        }

        // se recebermos um texto de fora podemos pegar o enum a partir dele.
        String text = "CANCELED";
        RequestStatus result = RequestStatus.valueOf(text);
        System.out.println(result);

        // se quisermos pesquisar por número podemos utilizar o values
        int number = 1;
        RequestStatus resultNumber = RequestStatus.values()[number];
        System.out.println(resultNumber);
    }
}
