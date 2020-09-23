package Forth_prac_lab.laboratory;


public class Tester {
    public static void main(String[] args) {
        Human human=new Human("Oleg");
        System.out.println(human.getName());
        Toy toy=new Toy(1000);
        System.out.println(toy.getPrice());
        Car car=new Car("BMW",20000);
        System.out.println(car.getName()+" "+car.getPrice());
    }
}
