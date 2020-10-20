package Lesson_11.Prac;

import java.util.ArrayList;

public class ArrayQueue<T> {
    private ArrayList<T> list;
    ArrayQueue(ArrayList<T> list){
        this.list = list;
    }
    public boolean enqueue (T e){
        return list.add(e);
    }
    public T dequeue (){
        T temp = list.get(0);
        list.remove(0);
        return temp;
    }
    public T element(){
        return list.get(0);
    }
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void clear(){
        list.clear();
    }

    @Override
    public String toString() {
        return "ArrayQueue: " + list;
    }
}
