package Lesson_11.Prac;

import java.util.ArrayList;

public class ArrayQueueModule<T> {
    private ArrayList<T> list;

    public ArrayQueueModule() {
        this.list = new ArrayList<T>();
    }

    public void add(T e){
        list.add(e);
    }

    public ArrayList<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "ArrayQueueModule: " + list;
    }
}
