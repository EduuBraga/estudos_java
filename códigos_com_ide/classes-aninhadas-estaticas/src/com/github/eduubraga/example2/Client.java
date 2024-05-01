package com.github.eduubraga.example2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Client {
    private String name;
    private int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void sortByAge(ArrayList<Client> clients) {
        clients.sort(new AgeComparator());
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private static class AgeComparator implements Comparator<Client>{
        @Override
        public int compare(Client o1, Client o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
