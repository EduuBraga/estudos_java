package com.github.eduubraga;

public class MainTwo {
    public static void main(String[] args) {
        String name = "Carlos Eduardo Ponciano Braga";

        System.out.println(getSecondName(name));
    }

    private static String getLastName(String name) {
        int positionFirstSpace = name.indexOf(" ");

        if (positionFirstSpace < 0) {
            throw new IllegalArgumentException("Não é um nome completo!");
        }

        return name.substring(positionFirstSpace + 1);
    }

    private static String getSecondName(String name) {
        int positionFirstSpace = name.indexOf(" ");
        int positionSecondSpace = name.indexOf(" ", positionFirstSpace + 1);

        if (positionFirstSpace < 0) {
            throw new IllegalArgumentException("Não é um nome completo!");
        }

        return name.substring(positionFirstSpace + 1,
                positionSecondSpace < 0 ? name.length() : positionSecondSpace);
    }
}
