package Third_prac_lab.Practice;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("___s1_________________________________");
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // вызван из класса Circle
        System.out.println(s1.getArea()); // вызван из класса Circle
        System.out.println(s1.getPerimeter()); // вызван из класса Circle
        System.out.println(s1.getColor()); // вызван из класса Shape
        System.out.println(s1.isFilled()); // вызван из класса Circle
        //System.out.println(s1.getRadius()); // метода getRadius нет в классе Shape
        System.out.println("___c1_________________________________");

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1); // вызван из класса Circle
        System.out.println(c1.getArea());// вызван из класса Circle
        System.out.println(c1.getPerimeter());// вызван из класса Circle
        System.out.println(c1.getColor()); // вызван из класса Shape
        System.out.println(c1.isFilled()); // вызван из класса Shape
        System.out.println(c1.getRadius()); // вызван из класса Circle
        System.out.println("___s3_________________________________");

        //Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3); // вызван из класса Rectangle
        System.out.println(s3.getArea()); // вызван из класса Rectangle
        System.out.println(s3.getPerimeter()); // вызван из класса Rectangle
        System.out.println(s3.getColor()); // вызван из класса Shape
       // System.out.println(s3.getLength()); // метода getLength() нет в классе Shape
        System.out.println("___r1_________________________________");

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1); // вызван из класса Rectangle
        System.out.println(r1.getArea()); // вызван из класса Rectangle
        System.out.println(r1.getColor()); // вызван из класса Shape
        System.out.println(r1.getLength()); // вызван из класса Rectangle
        System.out.println("___s4_________________________________");

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4); // вызван из класса Square
        System.out.println(s4.getArea()); // вызван из класса Square
        System.out.println(s4.getColor()); // вызван из класса Shape
        //System.out.println(s4.getSide()); // метода getSide() нет в классе Shape
        System.out.println("___r2_________________________________");

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2); // вызван из класса Rectangle
        System.out.println(r2.getArea()); // вызван из класса Rectangle
        System.out.println(r2.getColor()); // вызван из класса Shape
        //System.out.println(r2.getSide()); // метода getSide() нет в классе Rectangle
        System.out.println(r2.getLength()); // вызван из класса Rectangle
        System.out.println("___sq1_________________________________");

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1); // вызван из класса Square
        System.out.println(sq1.getArea()); // вызван из класса Square
        System.out.println(sq1.getColor()); // вызван из класса Shape
        System.out.println(sq1.getSide()); // вызван из класса Square
        System.out.println(sq1.getLength()); // вызван из класса Square
        System.out.println("_________________________________");
    }
}
