package Lesson_16.Prac.task5;

public interface Order {
    boolean add(Item item);
    boolean delete(String name);
    int deleteAll(String name);
    int getOrderSize();
    Item[] getArray();
    int getOrderCost();
    int getItemQuantity(String name);
    String[] getArrayOfItemsName();
    Item[] sortedOrderByCost();
}
