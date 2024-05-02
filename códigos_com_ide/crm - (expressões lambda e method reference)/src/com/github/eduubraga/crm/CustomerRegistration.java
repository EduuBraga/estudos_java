package com.github.eduubraga.crm;

import java.util.ArrayList;
import java.util.List;

public class CustomerRegistration {
    private final ArrayList<Client> clients = new ArrayList<>();

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void add(Client client) {
        clients.add(client);
    }

    public List<Client> consult(Filter<Client> filter) {
        ArrayList<Client> listFiltered = new ArrayList<>();

        for (Client client : clients) {
            if (filter.toAssess(client)) {
                listFiltered.add(client);
            }
        }

        return listFiltered;
    }
}
