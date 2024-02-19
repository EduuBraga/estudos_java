package com.github.eduubraga;

import com.github.eduubraga.store.stock.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product = new Product("mouse X pro");
        product.setActive(true);
        product.addStock(10);

        while (true) {
            try {
                System.out.printf("%s tem %d em estoque, quantos deseja retirar? ",
                        product.getName(),
                        product.getQuantityInStock());

                int response = scanner.nextInt();

                product.removeStock(response);

                System.out.println("Retira efetuada com sucesso!");
                break;
            } catch (IllegalArgumentException iae) {
                System.out.println("Erro ao tentar movimentar o produto: " + iae.getMessage());

                System.out.print("Deseja retirar novamente? ");
                if (scanner.nextBoolean()) {
                    System.out.print("Quantidade: ");
                    int response = scanner.nextInt();

                    try {
                        product.removeStock(response);
                    } catch (IllegalArgumentException iae2) {
                        System.out.println("Invalido: " + iae2.getMessage());
                    }
                } else {
                    System.out.println("Ok");
                }

            }
        }

        System.out.printf("Quantidade de %s em estoque: %d", product.getName(), product.getQuantityInStock());
    }
}
