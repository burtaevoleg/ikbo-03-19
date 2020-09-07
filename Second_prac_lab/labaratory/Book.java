package Second_prac_lab.labaratory;

class Book {
    private String author;
    private String title;
    private int year;
    private int size;

    public Book(String author, String title, int year, int size) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.size = size;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", size=" + size +
                '}';
    }
}
