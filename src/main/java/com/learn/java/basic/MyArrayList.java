package com.learn.java.basic;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<T extends Number> implements MyList<T> {

    private T[] myArrayList;

    public MyArrayList() {
        myArrayList = (T[]) new Number[0];
    }

    @Override
    public void add(T obj) {
        T[] temp = myArrayList;
        myArrayList = (T[]) new Number[temp.length + 1];
        System.arraycopy(temp, 0, myArrayList, 0, temp.length);
        myArrayList[myArrayList.length - 1] = obj;
    }

    @Override
    public void add(int index, T obj) {
        T[] temp = myArrayList;
        myArrayList = (T[]) new Number[temp.length + 1];
        System.arraycopy(temp, 0, myArrayList, 0, index);
        int numMoved = temp.length - index;
        System.arraycopy(temp, index, myArrayList, index + 1, numMoved);
//        System.arraycopy(myArrayList, index, myArrayList, index + 1, myArrayList.length - index);
        myArrayList[index] = obj;
    }

    @Override
    public T remove() {
        T removedElement = myArrayList[myArrayList.length - 1];
        T[] temp = myArrayList;
        myArrayList = (T[]) new Number[temp.length - 1];
        System.arraycopy(temp, 0, myArrayList, 0, temp.length - 1);
        return removedElement;
    }

    @Override
    public T remove(int index) {
        T removedElement = myArrayList[index];
        T[] temp = myArrayList;
        myArrayList = (T[]) new Number[temp.length - 1];
        System.arraycopy(temp, 0, myArrayList, 0, index);
        int numMoved = temp.length - index - 1;
        System.arraycopy(temp, index + 1, myArrayList, index, numMoved);
        return removedElement;
    }

    @Override
    public void sort() {
        Arrays.sort(myArrayList);
    }

    @Override
    public void sort(Comparator<T> comparator) {
        Arrays.sort(myArrayList, comparator);
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "myArrayList=" + Arrays.toString(myArrayList) +
                '}';
    }
}
