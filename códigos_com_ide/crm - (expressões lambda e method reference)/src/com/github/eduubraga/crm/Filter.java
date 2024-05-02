package com.github.eduubraga.crm;

public interface Filter<T> {
    boolean toAssess(T obj);
}