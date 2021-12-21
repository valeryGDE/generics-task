package com.learn.java.basic;

import com.learn.java.basic.comparator.NumberComparator;

public class Main {

    public static void main(String[] args) {

        Mark <Integer, String> mark1 = new Mark<Integer, String>(10, "Good job");
        Mark <Character, Character> mark2 = new Mark<Character, Character>('+', 'g');
        System.out.println(mark1.toString());
        System.out.println(mark2.toString());


        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.add(1);
        myArrayList.add(4);
        myArrayList.add(10);
        myArrayList.add(8);
        myArrayList.add(7);
        myArrayList.add(6);
        myArrayList.add(9);
        myArrayList.add(5);
        System.out.println(myArrayList);

        myArrayList.add(2, 33);
        System.out.println(myArrayList);

        myArrayList.remove();
        System.out.println(myArrayList);

        myArrayList.remove(2);
        System.out.println(myArrayList);

        myArrayList.sort(new NumberComparator<>());
        System.out.println(myArrayList);
    }
}
