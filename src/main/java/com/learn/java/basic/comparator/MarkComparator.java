package com.learn.java.basic.comparator;

import com.learn.java.basic.Mark;

import java.util.Comparator;

public class MarkComparator<T extends Number & Comparable> implements Comparator<Mark<T>> {

    @Override
    public int compare(Mark<T> o1, Mark<T> o2) {
        return o2.compareTo(o1);
    }
}
