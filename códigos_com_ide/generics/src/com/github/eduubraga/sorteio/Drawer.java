package com.github.eduubraga.sorteio;

import java.util.Random;

public class Drawer {
    public static final Random RANDOM = new Random();

    public static <T> T draw(T[] list){
        if(list.length == 0){
            throw new IllegalArgumentException("A lista deve ter no mínimo um item");
        }

        int indexClientDrawn = RANDOM.nextInt(list.length);

        return list[indexClientDrawn];
    }
}
