import java.awt.*;
import java.util.Scanner;

/**
 * Created by Lori on 2/6/2017.
 */
public class Application {

    /**
     * This method is a test method for the Books class.
     * It creates an array of 30 Books objects and at the end calls the method from Books which
     * returns the details of all the 30 books.
     */
    private void BookTest() {
        Scanner input = new Scanner(System.in);
        Books[] books = new Books[30];
        String temp = "";
        int isbn = 0;

        for (int index = 0; index < books.length; index++) {
            System.out.format("Enter the name of book %d:", index);
            temp = input.nextLine();
            books[index] = new Books();
            books[index].setBookName(temp);

            System.out.format("Enter the author's name for book %d: ", index);
            temp = input.nextLine();
            books[index].setAuthorName(temp);

            System.out.format("Enter the publisher for book %d: ", index);
            temp = input.nextLine();
            books[index].setPublisher(temp);

            System.out.format("Enter ISBN for book %d:", index);
            isbn = Integer.parseInt(input.nextLine());
            books[index].setIsbn(isbn);
            System.out.println();
        }

        for (int index = 0; index < books.length; index++) {
            System.out.println("Book details: " + books[index].getBookInfo());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.BookTest();
    }
}
