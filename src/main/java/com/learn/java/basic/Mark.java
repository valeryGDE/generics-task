package com.learn.java.basic;

public class Mark <T1, T2>{

    private T1 mark;
    private T2 comment;

    public Mark() {
    }

    public Mark(T1 mark, T2 comment) {
        this.mark = mark;
        this.comment = comment;
    }

    public T1 getMark() {
        return mark;
    }

    public void setMark(T1 mark) {
        this.mark = mark;
    }

    public T2 getComment() {
        return comment;
    }

    public void setComment(T2 comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "mark=" + mark +
                ", comment=" + comment +
                '}';
    }
}
