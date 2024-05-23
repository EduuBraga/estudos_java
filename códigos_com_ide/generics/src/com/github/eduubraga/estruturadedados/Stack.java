package com.github.eduubraga.estruturadedados;

import java.util.Arrays;

public class Stack<T> implements MyCollection<T> {
    private T[] itens;

    public Stack() {
        itens = (T[]) new Object[0];
    }

    public void toPlace(T item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    public T toRemove() {
        if (itens.length == 0) {
            throw new EmptyStackException("Pilha está vazia.");
        }

        T itemRemoved = itens[itens.length - 1];
        itens = Arrays.copyOf(itens, itens.length - 1);

        return itemRemoved;
    }
}
