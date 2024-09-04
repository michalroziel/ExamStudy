package ex8;
import java.time.LocalDate;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int year;
    private int pages;
    private String genre;
    private double rating; // 1.0 to 5.0
    private boolean borrowed;
    private LocalDate returnDate;

    // Constructor
    public Book(String title, String author, int year, int pages, String genre, double rating, boolean borrowed, LocalDate returnDate) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.genre = genre;
        this.rating = rating;
        this.borrowed = borrowed;
        this.returnDate = returnDate;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    // Implementing compareTo for sorting by title
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    // Override toString for easy printing
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", borrowed=" + borrowed +
                ", returnDate=" + returnDate +
                '}';
    }
}