package com.learn.java.basic;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<T> implements MyList<T> {

    private Object[] myArrayList;
    private int currentFreeIndex = 0;

    public MyArrayList() {
        myArrayList = new Object[10];
    }

    @Override
    public void add(T obj) {
        if (currentFreeIndex >= myArrayList.length) {
            Object[] temp = myArrayList;
            myArrayList = new Object[temp.length + 1];
            System.arraycopy(temp, 0, myArrayList, 0, temp.length);
        }
        myArrayList[currentFreeIndex] = obj;
        currentFreeIndex++;
    }

    @Override
    public void add(int index, T obj) {
        Object[] temp = myArrayList;
        if (currentFreeIndex >= myArrayList.length) {
            myArrayList = new Object[temp.length + 1];
        }
        System.arraycopy(temp, 0, myArrayList, 0, index);
        int numMoved = temp.length - index;
        System.arraycopy(temp, index, myArrayList, index + 1, numMoved);
        myArrayList[index] = obj;
        currentFreeIndex++;
    }

    @Override
    public T remove() {
        T removedElement = (T) myArrayList[myArrayList.length - 1];
        Object[] temp = myArrayList;
        myArrayList = new Object[temp.length - 1];
        System.arraycopy(temp, 0, myArrayList, 0, temp.length - 1);
        currentFreeIndex--;
        return removedElement;
    }

    @Override
    public T remove(int index) {
        T removedElement = (T) myArrayList[index];
        Object[] temp = myArrayList;
        myArrayList = new Object[temp.length - 1];
        System.arraycopy(temp, 0, myArrayList, 0, index);
        int numMoved = temp.length - index - 1;
        System.arraycopy(temp, index + 1, myArrayList, index, numMoved);
        currentFreeIndex--;
        return removedElement;
    }

    @Override
    public void sort() {
        Arrays.sort(myArrayList, 0, currentFreeIndex);
    }

    @Override
    public void sort(Comparator<?> comparator) {
        Comparator<? super T> comp = (Comparator<? super T>) comparator;
        Arrays.sort((T[]) myArrayList, 0, currentFreeIndex, comp);
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "myArrayList=" + Arrays.toString(myArrayList) +
                '}';
    }
}
