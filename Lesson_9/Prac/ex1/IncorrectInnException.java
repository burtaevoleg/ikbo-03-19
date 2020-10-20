package Lesson_9.Prac.ex1;

public class IncorrectInnException extends Exception {
    public IncorrectInnException(Client client){
        super("Максимальное число знаков: 10. У клиента "+client.getFIO()+" количество знаков ИНН: "+client.getNumber_INN().length());
    }

    public IncorrectInnException(String massage){
        super(massage);
    }
}
