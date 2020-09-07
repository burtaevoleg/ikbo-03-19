package Second_prac_lab.labaratory;

import Second_prac_lab.labaratory.*;

public class Tester {
    public static void main(String[] args) {
        Circle circle=new Circle(10);
        System.out.println(circle.toString());
        Human human=new Human(new Leg(44.0),new Hand(60),new Head("L"),24,"male");
        System.out.println(human.toString());
    }
}
