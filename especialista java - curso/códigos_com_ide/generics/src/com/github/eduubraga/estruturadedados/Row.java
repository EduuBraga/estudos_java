package com.github.eduubraga.estruturadedados;

import java.util.Arrays;

public class Row<T> implements MyCollection<T> {
    private T[] itens;

    public Row() {
        itens = (T[]) new Object[0];
    }

    public void toPlace(T item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    public T toRemove() {
        if (itens.length == 0) {
            throw new EmptyStackException("Fila sem itens.");
        }

        T itemRemoved = itens[0];
        T[] newItens = (T[]) new Object[itens.length - 1];
        System.arraycopy(itens, 1, newItens, 0, newItens.length);
        itens = newItens;

        return itemRemoved;
    }
}
