package Third_prac_lab.laboratory;

public class Dog {
    private int age;
    private boolean homeless;
    private String color;

    public Dog(int age, boolean homeless, String color) {
        this.age = age;
        this.homeless = homeless;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHomeless() {
        return homeless;
    }

    public void setHomeless(boolean homeless) {
        this.homeless = homeless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

class Husky extends Dog{
    public Husky(int age, boolean homeless, String color) {
        super(age, homeless, color);
    }

    @Override
    public String toString() {
        return "Husky{" +
                "возраст = " + getAge() +
                ", бездомна =" + isHomeless() +
                ", цвет='" + getColor() + '\'' +
                '}';
    }
}

class Shepherd extends Dog{
    public Shepherd(int age, boolean homeless, String color) {
        super(age, homeless, color);
    }

    @Override
    public String toString() {
        return "Shepherd{" +
                "age=" + getAge() +
                ", homeless=" + isHomeless() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}

