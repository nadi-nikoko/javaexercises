package javaClass.ObjectedOriented.library_ex02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Library {
    List<Book> listBooks;

    public Library() {
        listBooks = new ArrayList<>();
    }

    public static void main(String[] args) {

        Library casa = new Library();
        Library ucio = new Library();
        // Library.Book is a class inside a class
        Library.Book b1 = casa.addBook("Esercizi di stile", "Queneau");
        b1.addTag("letteratura");
        b1.addTag("umorismo");
        Library.Book b2 = casa.addBook("Me parlare bene un giorno", "Sedaris");
        b2.addTag("umorismo");
        Library.Book b3 = ucio.addBook("Literate programming", "Knuth");
        b3.addTag("programmazione");
        b3.addTag("programmazione");
        b3.addTag("umorismo");
        Set<Library.Book> humorCasa = casa.getBooksByTag("umorismo");
        System.out.println(humorCasa);
        Set<Library.Book> humorUcio = ucio.getBooksByTag("umorismo");
        System.out.println(humorUcio);
        Set<Library.Book> code = ucio.getBooksByTag("programmazione");
        System.out.println(code);

    }

    // stream method to be able to create new Set<Book> with wished tags
    private Set<Book> getBooksByTag(String string) {
        Set<Book> tagListBooks = listBooks.stream()
                .filter(v -> v.getTag().contains(string))
                .collect(Collectors.toSet());
        return tagListBooks;
    }

    // return book so it can be used it without the need of calling it again with a
    // get() method
    private Book addBook(String title, String author) {
        Book newBook = new Book(title, author);
        listBooks.add(newBook);
        return newBook;
    }

    // in this case the class book is build inside library class
    static class Book {
        private String title;
        private String author;
        private Set<String> tag;

        // start the tag with an empty string
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.tag = new HashSet<>();

        }

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

        @Override
        public String toString() {
            return " -- title= " + title + ", author= " + author + ", tag= " + tag + "]";
        }

        public Set<String> getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag.add(tag);
        }

        // it does a check if the tag is null
        public void addTag(String tag) {
            this.tag.add(tag);
        }
    }
}