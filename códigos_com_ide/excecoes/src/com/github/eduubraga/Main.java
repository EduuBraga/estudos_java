package com.github.eduubraga;

import com.github.eduubraga.store.stock.Product;
import com.github.eduubraga.store.stock.exceptions.InactiveProductException;
import com.github.eduubraga.store.stock.exceptions.ProductOutStockException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product = new Product("mouse X pro");
        product.addStock(10);

        while (true) {
            try {
                System.out.printf("%s tem %d em estoque, quantos deseja retirar? ",
                        product.getName(), product.getQuantityInStock());
                int quantityToRemove = scanner.nextInt();

                product.removeStock(quantityToRemove);

                System.out.println("Retira efetuada com sucesso!");
                break;
            } catch (IllegalArgumentException iae) {
                System.out.println("Erro na compra: " + iae.getMessage());
            } catch (InactiveProductException e) {
                System.out.println("Erro na compra: " + e.getMessage());

                System.out.print("Deseja ativar o produto? ");
                if (scanner.nextBoolean()) {
                    product.setActive(true);
                    System.out.println("Produto ativado com sucesso!");
                } else {
                    System.out.println("Ok. Produto continua inativo.");
                    break;
                }
            } catch (ProductOutStockException e) {
                System.out.println("Erro na compra: " + e.getMessage());

                System.out.print("Deseja tentar retirar novamente? ");
                if (scanner.nextBoolean()) {
                    System.out.print("Quantidade: ");
                    int quantityToRemove = scanner.nextInt();

                    try {
                        product.removeStock(quantityToRemove);
                        System.out.println("Retira efetuada com sucesso!");
                        break;
                    } catch (ProductOutStockException e2) {
                        System.out.println("Invalido: " + e2.getMessage());
                    }
                } else {
                    System.out.println("Ok");
                }
            }
        }

        System.out.printf("Quantidade de %s em estoque: %d", product.getName(), product.getQuantityInStock());

    }
}