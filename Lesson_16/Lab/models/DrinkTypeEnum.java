package Lesson_16.Lab.models;

public enum DrinkTypeEnum {
    BEER(true),
    WINE(true),
    VODKA(true),
    BRANDY(true),
    CHAMPAGNE(true),
    WHISKEY(true),
    TEQUILA(true),
    RUM(true),
    VERMUTH(true),
    LIQUOR(true),
    JAGERMEISTER(true),
    JUICE(true),
    COFFEE(false),
    GREEN_TEA(false),
    BLACK_TEA(false),
    MILK(false),
    WATER(false),
    SODA(false);

    private final boolean alcohol;

    DrinkTypeEnum(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public boolean isAlcohol() {
        return alcohol;
    }
}
