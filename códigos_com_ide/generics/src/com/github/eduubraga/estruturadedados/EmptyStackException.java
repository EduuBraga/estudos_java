package com.github.eduubraga.estruturadedados;

import java.lang.RuntimeException;

public class EmptyStackException extends RuntimeException {
    public EmptyStackException(String message) {
        super(message);
    }
}
