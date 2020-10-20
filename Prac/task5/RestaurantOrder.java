package Lesson_16.Prac.task5;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class RestaurantOrder implements Order {

    private OrderLinkedList list;


    public RestaurantOrder() {
        list=new OrderLinkedList();
    }

    public RestaurantOrder(Collection<Item> collection){
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
            cost+=item!=null ? item.getCost() : 0;
        }
        return cost;
    }

    @Override
    public int getItemQuantity(String name){
        int count = 0;

        for (Item item : list.toArray()) {
            count+= item!=null ? item.getName().equals(name) ? 1 : 0 : 0;
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
        return str;
    }

    @Override
    public Item[] sortedOrderByCost(){
        Item[] items=list.toArray();
        for(int i=0;i<items.length-1;i++){
            Item item=items[i];
            int index=i;
            for(int j=i+1;j<items.length;j++){
                if(items[j].getCost()>item.getCost()) {
                    item = items[j];
                    index=j;
                }
            }
            Item t=items[i];
            items[i]=item;
            items[index]=t;

        }
        return items;
    }
}

