package Lesson_12.PRAC.task2;

public class AddressTest {
    public static void main(String[] args) {
        System.out.println(new Address("Россия, Москва, Москва, Юго-Западная, 125, 1"));
        System.out.println(new Address("Россия, Москва, Москва, пр. Вернадского, 78, 1"));
        System.out.println(new Address("Россия, Москва, Москва, Татьянин парк, 15c5, 2"));
        System.out.println(new Address("Россия, Москва, Москва, Аэропорт, 20, 1"));

        System.out.println(new Address("Россия - Москва - Москва - Юго-Западная - 125 - 1","-"));
        System.out.println(new Address("Россия; Москва; Москва; пр. Вернадского; 78; 1",";"));
        System.out.println(new Address("Россия. Москва. Москва. Татьянин парк. 15c5. 2","."));
        System.out.println(new Address("Россия, Москва, Москва, Аэропорт, 20, 1",","));
    }
}
