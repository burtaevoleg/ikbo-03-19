package Lesson_16.Prac.task3;

import java.util.Collection;

public class OrderLinkedList {

    private Node first,last;
    private int size=0;


    public int getSize() {
        return size;
    }

    class Node{
        Node prev,next;
        Item item;

        public Node(Node prev, Item item, Node next) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }

    public OrderLinkedList() {
    }

    public OrderLinkedList(Collection<Item> collection) {
        addAll(collection);
    }


    public boolean delete(Item item){
        if (item == null) {
            for (Node node = first; node != null; node = node.next) {
                if (node.item == null) {
                    updateNodes(node);
                    return true;
                }
            }
        } else {
            for (Node node = first; node != null; node = node.next) {
                if (item.equals(node.item)) {
                    updateNodes(node);
                    return true;
                }
            }
        }
        return false;
    }

    private void updateNodes(Node node){
        Node next = node.next;
        Node prev = next.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            node.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }

        node.item = null;
        size--;
    }

    private void addAll(Collection<Item> collection){
        for(Item item:collection){
            add(item);
        }
    }

    public boolean add(Item item) {
        Node last = this.last;
        Node newNode = new Node(last, item, null);
        this.last = newNode;

        if (last == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        size++;
        return true;
    }

    public Item[] toArray() {
        Item[] objects =new Item[size];
        int i = 0;

        for (Node node = first; node != null; node = node.next) {
            objects[i++] = node.item;
        }

        return objects;
    }
}
