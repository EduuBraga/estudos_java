package com.github.eduubraga;

import java.util.Comparator;

public class AgeContactComparator implements Comparator<Contact> {

    @Override
    public int compare(Contact o1, Contact o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
