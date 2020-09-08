package Third_prac_lab.laboratory;

import java.util.ArrayList;
import java.util.List;

public abstract class Furniture {
    private String name;
    private int price;

    public Furniture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Bed extends Furniture{
    private int places_on_bed;
    private boolean folding;

    public Bed(String name, int price, int places_on_bed, boolean folding) {
        super(name, price);
        this.places_on_bed = places_on_bed;
        this.folding = folding;
    }

    public int getPlaces_on_bed() {
        return places_on_bed;
    }

    public void setPlaces_on_bed(int places_on_bed) {
        this.places_on_bed = places_on_bed;
    }

    public boolean isFolding() {
        return folding;
    }

    public void setFolding(boolean folding) {
        this.folding = folding;
    }

    @Override
    public String toString() {
        return "Кровать{ " +
                "цена=" + getPrice() +
                ", мест на кровати=" + places_on_bed +
                ", раскладывающияся=" + folding +
                " }";
    }
}

class Table extends Furniture{
    private double length;

    public Table(String name, int price, double length) {
        super(name, price);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Стол {" +
                " цена=" + getPrice() +
                ", длина=" + length +
                "} ";
    }
}


class FurnitureShop{
    private List<Furniture> shop=new ArrayList<>();

    public FurnitureShop() {
    }

    public FurnitureShop(List<Furniture> shop) {
        this.shop = shop;
    }

    public List<Furniture> getShop() {
        return shop;
    }

    public void setShop(List<Furniture> shop) {
        this.shop = shop;
    }

    public void add(Furniture furniture){
        shop.add(furniture);
    }

    @Override
    public String toString() {
        return "Магазин{ " +
                "каталог = " + shop +
                " }";
    }
}