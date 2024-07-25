public class LibraryReference {

    public static void main(String[] args) {
        Author author1 = new Author("George", "Martin");
        Author author2 = new Author("John", "Tolkien");

        Book book1 = new Book("A Game of Thrones.", 1996, author1);
        Book book2 = new Book("The Lord of the Rings.", -1954, author2);

        book1.setYearOfPublication(1998);

        System.out.println();
        System.out.println(book1.toString());
        System.out.println();
        System.out.println(book2.toString());
    }
}
