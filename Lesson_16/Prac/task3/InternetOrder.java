package Lesson_16.Prac.task3;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;


public class InternetOrder {

    private OrderLinkedList list;


    public InternetOrder() {
        list=new OrderLinkedList();
    }

    public InternetOrder(Collection<Item> collection){
        list=new OrderLinkedList(collection);
    }

    public boolean addItem(Item item){
        return list.add(item);
    }

    public boolean deleteItem(String name){
        Item toDelete=null;
        for(Item item:list.toArray()){
            if(item.getName().equals(name))
                toDelete=item;
        }
        return list.delete(toDelete);
    }

    public int deleteAllItem(String name){
        int num=0;
        for(Item item:list.toArray()){
            if(item.getName().equals(name)) {
                num+=list.delete(item) ? 1 :0;
            }
        }
        return num;
    }

    public int getSumOfOrder(){
        return  list.getSize();
    }

    public Item[] getArray(){
        return list.toArray();
    }

    public int getOrderCost(){
        int cost=0;
        for(Item item:list.toArray()){
            cost+=item.getCost();
        }
        return cost;
    }

    public int getItemQuantity(String name){
        int count = 0;

        for (Item item : list.toArray()) {
            count+= item.getName().equals(name) ? 1 : 0;
        }
        return count;
    }

    public String[] getArrayOfItemsName(){
        HashSet<String> names=new HashSet<>();
        for(Item item:list.toArray()){
            names.add(item.getName());
        }
        return (String[]) names.toArray();
    }

    public Item[] sortedOrderByCost(){
        return (Item[]) Arrays.stream(list.toArray()).sorted((i1,i2) -> (int)(i2.getCost()-i1.getCost())).toArray();
    }
}
