import com.github.eduubraga.Request;
import com.github.eduubraga.RequestStatus;

public class Main {
    public static void main(String[] args) {
        Request request = new Request("eduu");

        request.setStatus(RequestStatus.INVOICED);

        System.out.println(request.getStatus());
        System.out.println(request.getDeliveryTimeInHours());
    }
}
