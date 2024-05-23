import com.github.eduubraga.challenge.Invoice;

public class MainChallenge {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(5_000, "PC");

        System.out.println(invoice.getNumber());
    }
}
