package com.github.eduubraga;

import com.github.eduubraga.crm.Client;
import com.github.eduubraga.crm.CustomerRegistration;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerRegistration customerRegistration = new CustomerRegistration();

        customerRegistration.add(new Client("Eduardo Braga", 20));
        customerRegistration.add(new Client("shin", 15));
        customerRegistration.add(new Client("ei sei", 15));
        customerRegistration.add(new Client("mou goku", 39));
        customerRegistration.add(new Client("houken", 40));

        while (true) {
            int response = startMessage();

            if (response == 1) {
                System.out.println("<-------------------------->");
                customerRegistration.getClients().forEach(System.out::println);
                System.out.println("<-------------------------->");

                if (!continueInTheProcess()) {
                    break;
                }
            } else if (response == 2) {
                List<Client> clients = filterClientsAgeMessage(customerRegistration);

                System.out.println("<-------------------------->");
                clients.forEach(System.out::println);
                System.out.println("<-------------------------->");

                if (!continueInTheProcess()) {
                    break;
                }
            } else if (response == 3) {
                break;
            } else {
                System.out.println();
            }
        }
    }

    public static int startMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 - Imprimir todos os clientes\n2 - filtrar clientes por idade\n3 - cancelar consultar\n-> ");
        return scanner.nextInt();
    }

    public static boolean continueInTheProcess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deseja algo mais? (s/n)\n-> ");
        String response = scanner.next();

        if (response.equals("s")) {
            return true;
        } else if (response.equals("n")) {
            System.out.println("Obrigado por utilizar o nosso serviço!");
            return false;
        } else {
            throw new RuntimeException("erro na resposta");
        }
    }

    public static List<Client> filterClientsAgeMessage(CustomerRegistration customerRegistration) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 - Maior que\n2 - Menor que\n-> ");
        int response = scanner.nextInt();

        return switch (response) {
            case 1 -> {
                System.out.print("Digite a idade para o calculo\n-> ");
                int ageForCalculation = scanner.nextInt();

                yield customerRegistration.consult(client -> client.getAge() >= ageForCalculation);
            }
            case 2 -> {
                System.out.print("Digite a idade para o calculo\n-> ");
                int ageForCalculation = scanner.nextInt();

                yield customerRegistration.consult(client -> client.getAge() <= ageForCalculation);
            }
            default -> throw new RuntimeException("Erro na resposta");
        };
    }
}
