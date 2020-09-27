package Lesson_10.Prac.ex1;

import Lesson_10.Prac.ex1.Complex;
import Lesson_10.Prac.ex1.ComplexAbstractFactory;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real,image);
    }
}
