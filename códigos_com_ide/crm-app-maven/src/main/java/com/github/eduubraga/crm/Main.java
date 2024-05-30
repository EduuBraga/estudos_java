package com.github.eduubraga.crm;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        ClientRegistration customerRegistration = new ClientRegistration();

        customerRegistration.add(new Client("Eduardo Braga", 20));
        customerRegistration.add(new Client("shin", 15));
        customerRegistration.add(new Client("ei sei", 15));
        customerRegistration.add(new Client("mou goku", 39));
        customerRegistration.add(new Client("houken", 40));

        customerRegistration
                .consult(client -> client.getAge() >= 20)
                .forEach(client -> System.out.printf("%s | %d%n",
                        StringUtils.center(client.getName(), 25, " - "),
                        client.getAge()));

    }

}
