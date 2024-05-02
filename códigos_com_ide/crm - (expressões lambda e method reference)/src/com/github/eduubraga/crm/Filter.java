package com.github.eduubraga.crm;

@FunctionalInterface
public interface Filter<T> {

    boolean toAssess(T obj);

}