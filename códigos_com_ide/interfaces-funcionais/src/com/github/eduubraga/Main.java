package com.github.eduubraga;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Predicate
        Predicate<String> predicate = str -> str.startsWith("e");
        String name = "edurdo";
        System.out.println(predicate.test(name));

        // Function
        Function<Number, String> function = num -> num.toString();
        String numString = function.apply(50);
        System.out.println(numString);

        // Supplier
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime localDateTime = supplier.get();
        System.out.println(localDateTime);


        //Consumer
        ArrayList<Client> clients = new ArrayList<>();

        clients.add(new Client("Eduardo", 20));
        clients.add(new Client("Vitória", 20));

        Consumer<Client> clientDescription = client ->
                System.out.printf("%s (%d anos)\n", client.getName(), client.getAge());

        for (Client client : clients) {
            clientDescription.accept(client);
        }
    }
}
