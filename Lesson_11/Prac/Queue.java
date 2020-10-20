package Lesson_11.Prac;

public interface Queue<T> {
    boolean enqueue  (T e);
    boolean isEmpty (T e);
    void clear  (T e);
    T element();
    T dequeue ();
    int size();
}
