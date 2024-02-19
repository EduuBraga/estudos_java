package com.github.eduubraga.store.stock.exceptions;

public class InactiveProductException extends RuntimeException{

    public InactiveProductException(String message) {
        super(message);
    }

}