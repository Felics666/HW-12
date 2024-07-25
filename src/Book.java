public class Book {

    private String theTitleOfTheBook;
    private int yearOfPublication;
    private Author author;

    public Book (String theTitleOfTheBook, int yearOfPublication, Author author){
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

    public Author getAuthor(){
        return this.author;
    }

    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
}
