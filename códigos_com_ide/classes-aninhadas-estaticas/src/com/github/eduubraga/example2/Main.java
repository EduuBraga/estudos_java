package com.github.eduubraga.example2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("Eduardo", 20));
        clients.add(new Client("Imaculada", 38));
        clients.add(new Client("yasmim", 13));

        Client.sortByAge(clients);

        System.out.println(clients);
    }
}
