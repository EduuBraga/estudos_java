package com.github.eduubraga.crm;

import java.util.Objects;

public class Researcher {
    public static <T extends Nameable> T research(T[] items, String name) {
        for (T item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }

        throw new RuntimeException("Nenhum item encontrado com este nome");
    }
}
