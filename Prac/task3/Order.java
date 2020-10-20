package Lesson_16.Prac.task3;

public class Order {
    private OrderLinkedList data;

    public Order() {
        this.data = new OrderLinkedList();
    }

    private boolean add(Item item) {
        return data.add(item);
    }

    private boolean delete(Item item) {
        return data.delete(item);
    }
}