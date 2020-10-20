package Lesson_11.Prac;

import java.util.ArrayList;

public class ArrayQueueADT<T> {
    public boolean enqueue (ArrayList<T> arr, T e){
        return arr.add(e);
    }
    public T dequeue (ArrayList<T> arr){
        T temp = arr.get(0);
        arr.remove(0);
        return temp;
    }
    public T element(ArrayList<T> arr){
        return arr.get(0);
    }
    public int size(ArrayList<T> arr){
        return arr.size();
    }
    public boolean isEmpty(ArrayList<T> arr){
        return arr.isEmpty();
    }

    public void clear(ArrayList<T> arr){
        arr.clear();
    }
}
