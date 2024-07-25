public class LibraryReference {

    public static void main(String[] args) {
        Author author1 = new Author("George", "Martin");
        Author author2 = new Author("John", "Tolkien");
        Author author3 = new Author("Lewis", "Carroll");

        Book book1 = new Book("A Game of Thrones.", 1996, author1);
        Book book2 = new Book("The Lord of the Rings.", 1954, author2);
        Book book3 = new Book("Alice in Wonderland.", 1865, author3);

        book1.setYearOfPublication(1998);

        System.out.println();
        System.out.println(book1.toString());
        System.out.println();
        System.out.println(book2.toString());
        System.out.println();

        System.out.println(book3.equals(book1));
        System.out.println(author1.equals(author3));
    }
}
