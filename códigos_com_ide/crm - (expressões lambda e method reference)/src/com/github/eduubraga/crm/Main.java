package com.github.eduubraga.crm;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerRegistration customerRegistration = new CustomerRegistration();

        customerRegistration.add(new Client("Eduardo", 20));
        customerRegistration.add(new Client("Maria", 78));
        customerRegistration.add(new Client("Ponciano", 68));
        customerRegistration.add(new Client("Imaculada", 38));

        List<Client> clients = customerRegistration.consult(client -> client.getAge() > 40);
        clients.sort((client1, client2) -> Integer.compare(client1.getAge(), client2.getAge()));

        for (Client client : clients) {
            System.out.printf("%s (%d anos)\n", client.getName(), client.getAge());
        }
    }
}
