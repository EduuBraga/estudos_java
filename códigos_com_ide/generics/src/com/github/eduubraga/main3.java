package com.github.eduubraga;

import com.github.eduubraga.estruturadedados.Product;
import com.github.eduubraga.estruturadedados.Stack;

public class main3 {
    public static void main(String[] args) {
        Stack<Product> stack = new Stack<>();

        stack.toPlace(new Product("Oleo soya 900ML", 6.85));
        stack.toPlace(new Product("Arroz vo olimpio C/10", 55.90));

        Product product = stack.toRemove();
        System.out.println("Item removido: " + product);

        product = stack.toRemove();
        System.out.println("Item removido: " + product);
    }
}
