package Forth_prac_lab.laboratory;

class Human implements Nameable {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
