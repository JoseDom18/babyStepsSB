public class Book {
    private String title;
    private String author;

    public Book () {
        this.title = "Unknown";
        this.author = "Unknown";
    }

    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book (String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public void showBookInfo() {
        System.out.printf("%s fue escrito por %s%n", this.title, this.author);
    }
}
