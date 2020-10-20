package Lesson_11.Prac;

public class AbstractQueue<T> {
    protected java.util.Queue<T> linkedQueue;

    AbstractQueue() {
        linkedQueue = new java.util.LinkedList<>();
    }

    public T element() {
        return linkedQueue.peek();
    }

    public T dequeue() {
        return linkedQueue.poll();
    }
}
