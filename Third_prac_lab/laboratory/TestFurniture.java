package Third_prac_lab.laboratory;

public class TestFurniture {
    public static void main(String[] args) {
        Table table=new Table("Стол",20000,100);
        System.out.println(table);
        Bed bed=new Bed("Кровать",30000,2,false);
        System.out.println(bed);
        FurnitureShop furnitureShop=new FurnitureShop();
        furnitureShop.add(table);
        furnitureShop.add(bed);
        System.out.println(furnitureShop);
    }
}
