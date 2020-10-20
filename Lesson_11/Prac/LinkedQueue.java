package Lesson_11.Prac;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedQueue<T> {
    private Queue<T> linkedQueue;

    LinkedQueue() {

        linkedQueue = new LinkedList<>();
    }

    public boolean enqueue(T e) {
        return linkedQueue.offer(e);
    }

    public boolean isEmpty(T e) {
        return linkedQueue.isEmpty();
    }

    public void clear(T e) {
        linkedQueue.clear();
    }

    public T element() {
        return linkedQueue.peek();
    }

    public T dequeue() {
        return linkedQueue.poll();
    }

    public int size() {
        return linkedQueue.size();
    }

    @Override
    public String toString() {
        return "LinkedQueue: " + linkedQueue;
    }





}
