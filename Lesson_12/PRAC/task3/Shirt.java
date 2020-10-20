package Lesson_12.PRAC.task3;

import java.util.StringTokenizer;

public class Shirt {
    private final String code;
    private final String type;
    private final String color;
    private final String size;

    public Shirt(String shirt) {
        String[] result=shirt.split(",");
        this.code=result[0];
        this.type=result[1];
        this.color=result[2];
        this.size=result[3];
    }

    @Override
    public String toString() {
        return "model = " + code + '\n' +
                "name = " + type + '\n' +
                "color = " + color + '\n' +
                "size = " + size + '\n';
    }
}
