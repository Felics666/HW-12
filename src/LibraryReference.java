public class LibraryReference {

    public static void main(String[] args) {
        Author author1 = new Author("George", "Martin");
        Author author2 = new Author("John", "Tolkien");

        Book book1 = new Book("A Game of Thrones.", 1996, author1);
        Book book2 = new Book("The Lord of the Rings.", 1954, author2);

        book1.setYearOfPublication(1998);

        System.out.println("Книга 1: " + book1.getTheTitleOfTheBook() + " Автор: " + book1.getAuthor().getFirstName()
                + " " + book1.getAuthor().getLastName() + ". " + "Год издания: " + book1.getYearOfPublication());
        System.out.println("Книга 2: " + book2.getTheTitleOfTheBook() + " Автор: " + book2.getAuthor().getFirstName()
                + " " + book2.getAuthor().getLastName() + ". " + "Год издания: " + book2.getYearOfPublication());
    }
}
