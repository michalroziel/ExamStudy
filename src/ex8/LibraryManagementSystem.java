package ex8;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LibraryManagementSystem {

    private TreeSet<Book> allBooks ;
    private  HashMap<Integer,User> allReaders;
    private TreeMap<Book,LocalDate> rentedBooks;


    public LibraryManagementSystem(){

        allBooks = new TreeSet<>();
        allReaders = new HashMap<>();

        // Comparator<Book> myComp = (a1,a2)-> a1.getReturnDate().compareTo(a2.getReturnDate());

        rentedBooks= new TreeMap<>(Comparator.comparing(Book::getReturnDate));
    }

    public boolean addBookToAllBooks(Book bookToAdd){
        if (bookToAdd != null){
            allBooks.add(bookToAdd);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean rentBook(User user, Book bookToRent ){
        if (user != null && bookToRent != null && !bookToRent.isBorrowed()){
            rentedBooks.put(bookToRent,LocalDate.now());
            user.rentBook(bookToRent);
            bookToRent.setBorrowed(true);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean showUserRentedBooks(User user){
        if ( user !=  null){
            user.getRentedBooks().forEach(System.out::println);
            return true;
        }
        else {
            return false;
        }
    }

    public void showAllRentedBooks (){

        rentedBooks.values().stream().forEach(System.out::println);
    }

    public boolean filterBookyByReleaseYear(int year){

        if (year != 0){
       rentedBooks.keySet().stream().filter(s -> s.getYear() <= year).forEach(System.out::println);
        return true;
        }
        return false;
       //List<Book> filteredBook = rentedBooks.keySet().filter()
    }

    public List<Book> filterBooksByPageCount() {
        return rentedBooks.keySet().parallelStream().sorted(Comparator.comparing(Book::getPages)).toList();
    }

    public boolean sumAllPAges(){

        int res = 0 ;
        //res = rentedBooks.keySet().stream().mapToInt(Book::getPages).sum();
        System.out.println(rentedBooks.keySet().stream().collect(Collectors.summingInt(Book::getPages)));
        return  true;
    }

    public boolean filterBooksByGenre(String givenGenre){
        if(givenGenre != null){
        rentedBooks.keySet().stream().filter(s -> s.getGenre().equalsIgnoreCase(givenGenre)).forEach(System.out::println);
        }
        return false;
    }

    public boolean averageRatingPerGenre(String genre){

        if ( genre != null){
            Map<String,Double>  newMap = rentedBooks.keySet().stream().collect(Collectors.groupingBy(
                    Book::getGenre,
                    Collectors.averagingDouble(Book::getRating)
            ));
        }

      return false;
    }

    public boolean show3BestBooks(){

        rentedBooks.keySet().stream().sorted(Comparator.comparing(Book::getRating))
                .limit(3).forEach(System.out::println);

        return true;
    }

    // After
    public void showAuthorsWithBestBooks(){
        Map<String, Integer> bestAuthors = rentedBooks.keySet().stream()
                .collect(Collectors.groupingBy(
                        Book::getAuthor,
                        Collectors.reducing(0, e -> 1, Integer::sum)
                ));
    }

    public void sortBooksByRating(){
        rentedBooks.keySet().stream().sorted(Comparator.comparing(Book::getRating))
                .forEach(System.out::println);
    }

    public List<Book> filteredAndSortBooks(Predicate<Book> pred, Comparator<Book> comp){
       return rentedBooks.keySet().stream().filter(pred).sorted(comp).toList();
    }










}
