package javaClass.ObjectedOriented.library_ex01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    static List<Book> listBooks = new ArrayList<>();
    static Book newBook;

    public static void main(String[] args) {
        addBook("zero and ones");
        addBook("zero");
        loanBook("zero and ones");
        loanBook("zero");
        printLoans();
        returnBook("zero and ones");

    }

    public static void addBook(String book) {
        newBook = new Book(book);

        if (!bookExist(book)) {
            listBooks.add(newBook);
            System.out.println("book is added to the library");
        } else
            System.out.println("this book already exist in the library");

    }

    public static boolean bookExist(String book) {
        for (Book books : listBooks) {
            if (book.equals(books.getBookName())) {
                return true;
            }
        }
        return false;
    }

    public static void loanBook(String book) {
        boolean bookFound = false;
        for (Book books : listBooks) {
            if (book.equals(books.getBookName())) {
                if (books.isAvailable()) {
                    System.out.println("here is your book");
                    bookFound = true;
                    books.setAvailable(false);
                    books.setLoanDate(LocalDateTime.now());
                } else
                    System.out.println("book is not available at the moment");
            }
        }
        if (!bookFound)
            throw new IllegalArgumentException("this book doesnt exist");
    }

    public static void returnBook(String book) {
        boolean bookFound = false;
        for (Book books : listBooks) {
            if (book.equals(books.getBookName())) {
                if (!books.isAvailable()) {
                    System.out.println("book is return");
                    books.setAvailable(true);
                    bookFound = true;
                }
            }
        }
        if (!bookFound)
            throw new IllegalArgumentException("this book doesnt exist");
    }

    public static void printLoans() {
        System.out.println("---- LIST OF BOOKS OUT OF LIBRARY ----");
        List<Book> loanedBooks = listBooks.stream()
                .filter(book -> !book.isAvailable())
                .sorted(Comparator.comparing(Book::getLoanDate).reversed())
                .collect(Collectors.toList());
        for (Book book : loanedBooks)
            System.out.println(book);
    }

}
