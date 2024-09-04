package ex8;

import java.util.TreeSet;

public class User {

    private String name;
    private int readeriD;

    public TreeSet<Book> getRentedBooks() {
        return rentedBooks;
    }

    private  TreeSet<Book> rentedBooks;

    public User(String givenName, int givenID){
        this.name = givenName;
        this.readeriD = givenID;
        rentedBooks = new TreeSet<>();
    }

    public boolean rentBook(Book bookToRent){
        if (bookToRent != null){
            rentedBooks.add(bookToRent);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean returnBook(Book bookToReturn){
        if (bookToReturn != null){
            rentedBooks.remove(bookToReturn);
            return true;
        }
        else {
            return false;
        }
    }



}
