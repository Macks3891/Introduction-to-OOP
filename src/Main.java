public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Федор", "Достоевский");
        Author author3 = new Author("Валерий", "Пупкин");

        Book book1 = new Book("Руслан и Людмила", author1, 1820 );
        Book book2 = new Book("Мастер и Маргарита", author2, 1928);

        book1.setYear(1920);
        book1.setTitle("Капитанская дочка");
        book2.setAuthor(author3);

        System.out.println(book1.getAuthor() + " " + book1.getTitle() + " " + book1.getYear());
        System.out.println(book2.getAuthor() + " " + book2.getTitle() + " " + book2.getYear());

    }
}

