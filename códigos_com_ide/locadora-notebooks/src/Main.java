import com.github.eduubraga.rentalcompany.Location;
import com.github.eduubraga.rentalcompany.Notebook;
import com.github.eduubraga.rentalcompany.Pricing;
import com.github.eduubraga.rentalcompany.PricingPerDay;

public class Main {
    public static void main(String[] args) {
        Notebook aspire5 = new Notebook("acer aspire 5", 6, 120);
        Pricing pricing = new PricingPerDay();

        Location location01 = new Location(aspire5, pricing);
        double valueDue = location01.calcAmountDue(25);

        System.out.printf("valor a pagar: R$%.2f%n", valueDue);
    }
}
