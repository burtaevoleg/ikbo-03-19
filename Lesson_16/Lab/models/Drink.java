package Lesson_16.Lab.models;

import Lesson_16.Lab.interfaces.Alcoholable;

public final class Drink extends MenuItem implements Alcoholable {
    private final double alcoholVol;
    private final DrinkTypeEnum type;

    public Drink(double alcoholVol, DrinkTypeEnum type) {
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return type.isAlcohol();
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
