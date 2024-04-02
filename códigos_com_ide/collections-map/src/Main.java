import com.github.eduubraga.Car;
import com.github.eduubraga.Owner;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car onix = new Car("QWE1234", "Onix lt");
        Car civic = new Car("RTY1234", "Civic");
        Car porsche = new Car("UIO1234", "Porsche");
        Car camaro = new Car("ASD1234", "Camaro");

        Owner jose = new Owner("11122233344", "José");
        Owner maria = new Owner("22233344455", "Maria");
        Owner antonio = new Owner("33344455566", "Antonio");

        Map<Car, Owner> owners = new HashMap<>();

        owners.put(onix, jose);
        owners.put(civic, maria);
        owners.put(camaro, jose);
        owners.put(porsche, antonio);

//        System.out.println(owners);

        for (Map.Entry<Car, Owner> carOwnerEntry : owners.entrySet()) {
            System.out.printf("%s (%s) = %s%n",
                    carOwnerEntry.getKey().getPlate(),
                    carOwnerEntry.getKey().getModel(),
                    carOwnerEntry.getValue().getName());
        }
    }
}
