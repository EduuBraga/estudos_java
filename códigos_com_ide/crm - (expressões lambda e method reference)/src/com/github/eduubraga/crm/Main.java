package com.github.eduubraga.crm;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerRegistration customerRegistration = new CustomerRegistration();

        customerRegistration.add(new Client("Eduardo", 20));
        customerRegistration.add(new Client("Maria", 78));
        customerRegistration.add(new Client("Ponciano", 68));
        customerRegistration.add(new Client("Imaculada", 38));

        Filter<Client> filter = new Filter<Client>() {
            @Override
            public boolean toAssess(Client obj) {
                return obj.getAge() < 40;
            }
        };

        List<Client> clients = customerRegistration.consult(filter);

        for (Client client : clients) {
            System.out.printf("%s (%d anos)\n", client.getName(), client.getAge());
        }
    }
}
