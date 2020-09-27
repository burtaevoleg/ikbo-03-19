package Lesson_10.Prac.ex1;

import Lesson_10.Prac.ex1.Complex;
import Lesson_10.Prac.ex1.ComplexAbstractFactory;
import Lesson_10.Prac.ex1.ConcreteFactory;

public class TextComplex {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex = factory.CreateComplex(123, 321);
        System.out.println(complex);
    }
}
