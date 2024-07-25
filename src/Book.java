import java.util.Objects;

public class Book {

    private final String theTitleOfTheBook;
    private int yearOfPublication;
    private final Author author;

    public Book(String theTitleOfTheBook, int yearOfPublication, Author author) {
        this.theTitleOfTheBook = theTitleOfTheBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getTheTitleOfTheBook() {
        return this.theTitleOfTheBook;
    }

    public int getYearOfPublication() {

        return this.yearOfPublication;
    }

    public Author getAuthor() {

        return this.author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга 1: " + theTitleOfTheBook + " Автор: " + author.toString()
                + ". " + "Год издания: " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return yearOfPublication == book.yearOfPublication && Objects.equals(theTitleOfTheBook, book.theTitleOfTheBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theTitleOfTheBook, yearOfPublication, author);
    }
}
