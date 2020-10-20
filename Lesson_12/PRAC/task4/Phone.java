package Lesson_12.PRAC.task4;

public class Phone {
    private final String code;
    private final String part_one;
    private final String part_two;
    private final String part_three;

    private final String regex="^((\\+\\d{11})|(\\d{11}))$";

    public Phone(String number) {
        if(number.matches(regex)) {
            if(number.length()==12) {
                this.code = String.valueOf(number.charAt(1));
                this.part_one = number.substring(2, 5);
                this.part_two = number.substring(5, 8);
                this.part_three = number.substring(8, 12);
                return;
            }
            this.code = String.valueOf((Integer.parseInt(String.valueOf(number.charAt(0))) - 1));
            this.part_one = number.substring(1, 4);
            this.part_two = number.substring(4, 7);
            this.part_three = number.substring(7, 11);
            return;
        }
        throw new IllegalStateException("Неправильный ввод");
    }


    @Override
    public String toString(){
        return String.format(
                "+%s%s-%s-%s",
                code, part_one, part_two, part_three);
    }
}
