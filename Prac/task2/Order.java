package Lesson_16.Prac.task2;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> data;

    public Order() {
        this.data = new LinkedList<>();
    }

    private boolean add(Item item) {
        return data.add(item);
    }

    private boolean remove(Item item) {
        return data.remove(item);
    }
}
