package com.github.eduubraga;

public class Main {
    public static void main(String[] args) {
        String name1 = "joão";
        String name2 = "joão";
        String name3 = new String("joão");

        System.out.println(name1 == name2); // true (compara a instância utilizando o pool de strings)
        System.out.println(name2 == name3); // false (compara a instância)
        System.out.println(name2.equals(name3)); // true (compara conteúdo)

        // equalsIgnoreCasa
        String name4 = "JOÃO";
        System.out.println(name1.equalsIgnoreCase(name4)); // true

        // contains
        String name5 = "João";
        System.out.println(name5.contains("ão")); // true

        // isBlank
        String name6 = " ";
        System.out.println(name6.isBlank()); // true

        // isEmpty
        String name7 = "";
        System.out.println(name7.isEmpty()); // true

        // startsWith
        String name8 = "João";
        System.out.println(name8.startsWith("Jo")); // true

        // endsWith
        String name9 = "João";
        System.out.println(name9.endsWith("Jo")); // false
    }
}
