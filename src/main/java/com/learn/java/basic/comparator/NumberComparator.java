package com.learn.java.basic.comparator;

import java.util.Comparator;

public class NumberComparator<T extends Number & Comparable> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o2.compareTo(o1);
    }
}
