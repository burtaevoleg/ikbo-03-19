package Lesson_16.Prac.task2;

public class OrderLinkedList<T> {
    private int size=0;
    private Node first,last;

    class Node{
        Node next;
        Node prev;
        T item;

        public Node(Node prev, T item, Node next) {
            this.next = next;
            this.prev = prev;
            this.item = item;
        }
    }








}
