public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("Los tres cochinitos", "Carlo Perez");
        Book book2 = new Book("Spring Boot");
        Book book3 = new Book();
        
        book1.showBookInfo();
        book2.showBookInfo();
        book3.showBookInfo();
    }
}
