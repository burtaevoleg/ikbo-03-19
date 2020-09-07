package Second_prac_lab.Practice;

public class TestAuthor {
    public static void main(String[] args) {
        Author author=new Author("Golosov Oleg","golosov@yandex.ru",'M');
        System.out.println(author.toString());
        author.setEmail("golosov.oleg@yandex.ru");
        System.out.println(author.toString());
    }
}
