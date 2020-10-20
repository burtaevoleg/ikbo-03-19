package Lesson_16.Prac.task5;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;


public class InternetOrder implements Order {

    private OrderLinkedList list;


    public InternetOrder() {
        list=new OrderLinkedList();
    }

    public InternetOrder(Collection<Item> collection){
        list=new OrderLinkedList(collection);
    }

    @Override
    public boolean add(Item item){
        return list.add(item);
    }

    @Override
    public boolean delete(String name){
        Item toDelete=null;
        for(Item item:list.toArray()){
            if(item.getName().equals(name))
                toDelete=item;
        }
        return list.delete(toDelete);
    }

    @Override
    public int deleteAll(String name){
        int num=0;
        for(Item item:list.toArray()){
            if(item.getName().equals(name)) {
                num+=list.delete(item) ? 1 :0;
            }
        }
        return num;
    }

    @Override
    public int getOrderSize(){
        return  list.getSize();
    }

    @Override
    public Item[] getArray(){
        return list.toArray();
    }

    @Override
    public int getOrderCost(){
        int cost=0;
        for(Item item:list.toArray()){
            cost+=item.getCost();
        }
        return cost;
    }

    @Override
    public int getItemQuantity(String name){
        int count = 0;

        for (Item item : list.toArray()) {
            count+= item.getName().equals(name) ? 1 : 0;
        }
        return count;
    }

    @Override
    public String[] getArrayOfItemsName(){
        HashSet<String> names=new HashSet<>();
        for(Item item:list.toArray()){
            names.add(item.getName());
        }
        String[] str = names.toArray(new String[names.size()]);
        return str;//(String[]) names.toArray();
    }

    @Override
    public Item[] sortedOrderByCost(){
        return (Item[]) Arrays.stream(list.toArray()).sorted((i1, i2) -> (int)(i2.getCost()-i1.getCost())).toArray();
    }
}
