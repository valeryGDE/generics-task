package com.learn.java.basic;

import java.util.Comparator;

public interface MyList<T extends Number> {

    void add(T obj);

    void add(int index, T obj);

    T remove();

    T remove(int index);

    void sort();

    void sort(Comparator<T> comparator);

//    void sort(Comparator<? super T> comparator);

}