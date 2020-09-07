package Second_prac_lab.labaratory;


public class BookTest {
    public static void main(String[] args) {
        Book book=new Book("Толстой","Война и мир",2020,5000);
        System.out.println(book.toString());
        book.setYear(2000);
        book.setAuthor("Пушкин");
        book.setTitle("Крестьянская дочка");
        System.out.println(book.toString());
    }
}
