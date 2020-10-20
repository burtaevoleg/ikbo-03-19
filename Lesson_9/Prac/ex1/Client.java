package Lesson_9.Prac.ex1;

import Lesson_9.Prac.ex1.IncorrectInnException;

public class Client {
    private String number_INN;
    private String FIO;

    public Client(String number_INN, String FIO) {
        this.number_INN = number_INN;
        this.FIO = FIO;
    }

    public void checkINN(String inn) throws IncorrectInnException {
        if(inn.length()!=10)
            throw new IncorrectInnException(this);
    }

    public String getNumber_INN() {
        return number_INN;
    }

    public void setNumber_INN(String number_INN) {
        this.number_INN = number_INN;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
}
