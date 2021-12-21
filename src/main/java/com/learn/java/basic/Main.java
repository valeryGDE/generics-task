package com.learn.java.basic;

import com.learn.java.basic.comparator.MarkComparator;

public class Main {

    public static void main(String[] args) {

        MyArrayList<Mark<Number>> myArrayList = new MyArrayList<>();
        myArrayList.add(new Mark<>(3));
        myArrayList.add(new Mark<>(2));
        myArrayList.add(new Mark<>(1));
        myArrayList.add(new Mark<>(4));
        myArrayList.add(new Mark<>(10));
        myArrayList.add(new Mark<>(8));
        myArrayList.add(new Mark<>(7));
        myArrayList.add(new Mark<>(6));
        myArrayList.add(new Mark<>(9));
        myArrayList.add(new Mark<>(5));
        myArrayList.add(new Mark<>(10.00000000001112));
        myArrayList.add(new Mark<>(10.00000000001111));
        System.out.println(myArrayList);

        myArrayList.sort();
        System.out.println(myArrayList);

        myArrayList.add(2, new Mark<>(33));
        System.out.println(myArrayList);

        myArrayList.remove();
        System.out.println(myArrayList);

        myArrayList.remove(2);
        System.out.println(myArrayList);

        myArrayList.sort(new MarkComparator());
        System.out.println(myArrayList);
    }
}
