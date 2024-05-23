package com.github.eduubraga;

public class MainThree {
    public static void main(String[] args) {
        String name = "Eduardo";

        //toLowerCase
        String nameLower = name.toLowerCase();
        System.out.println(nameLower);

        //toUpperCase
        String nameUpper = name.toUpperCase();
        System.out.println(nameUpper);

        //Strip
        String name01 = "\n   dudu   ";
        System.out.println(">" + name01 + "<");
        System.out.println(name01.strip());

        //Replace
        String name02 = "Carlos Eduardo Ponciano Braga";
        System.out.println(name02.toLowerCase().replace(" ", "_"));
    }
}
