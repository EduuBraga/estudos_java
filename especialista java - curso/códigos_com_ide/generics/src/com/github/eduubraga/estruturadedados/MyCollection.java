package com.github.eduubraga.estruturadedados;

public interface MyCollection<T> {
    void toPlace(T item);

    T toRemove();
}
