package com.learn.java.basic;

import java.math.BigDecimal;
import java.util.Objects;

public class Mark<T extends Number> implements Comparable<Mark<T>> {

    private T mark;

    public Mark() {
    }

    public Mark(T mark) {
        this.mark = mark;
    }

    public T getMark() {
        return mark;
    }

    public void setMark(T mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark<?> mark1 = (Mark<?>) o;
        return Objects.equals(mark, mark1.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark);
    }

    @Override
    public String toString() {
        return "Mark{" +
                "mark=" + mark +
                '}';
    }

    @Override
    public int compareTo(Mark<T> o) {
        BigDecimal b1 = new BigDecimal(mark.doubleValue());
        BigDecimal b2 = new BigDecimal(o.mark.doubleValue());
        return b1.compareTo(b2);
    }
}
