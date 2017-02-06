/**
 * This class contains private fields that are initialised by a constructor and also
 * by mutator and accessor methods.
 * It also contains a public method that is used to return all the description of the book.
 * The details contain book name, author name, publisher and isbn.
 * Created by Lori on 2/6/2017.
 */
public class Books {
    private String bookName;
    private int isbn;
    private String authorName;
    private String publisher;

    public Books() {
    }

    ;

    public Books(String bookName, int isbn, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * This method returns the description of a book.
     * @return the name of the book, authors name, publisher and isbn.
     */
    public String getBookInfo ()
    {
        return "Name: "+getBookName()+"\nISBN: "+getIsbn()+"\nAuthor name: "+getAuthorName()+"\nPublisher: "+getPublisher();
    }


}
