package Lesson_9.Prac.ex1;

public class Tester {
    public static void main(String[] args) {
        Client client=new Client("1234567890","Соколов М.А");
        try {
            client.checkINN(client.getNumber_INN());
            System.out.println("С номером ИНН у клиента "+client.getFIO()+" все в порядке.");
        } catch (IncorrectInnException e) {
            System.out.println(e.getMessage());;
        }
        Client client1=new Client("123","Буртаев О.А.");

        try {
            client1.checkINN(client1.getNumber_INN());
            System.out.println("С номером ИНН у клиента "+client1.getFIO()+" все в порядке.");
        } catch (IncorrectInnException e) {
            System.out.println(e.getMessage());
        }
    }
}
