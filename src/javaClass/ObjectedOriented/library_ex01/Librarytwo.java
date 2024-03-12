package javaClass.ObjectedOriented.library_ex01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Librarytwo {

    private final List<Book> libri;

    public Librarytwo() {
        this.libri = new ArrayList<>();
    }

    /*
     * aggiunge un libro alla biblioteca. Se il libro era già stato aggiunto,
     * restituisce false.
     */
    public boolean addBook(Book b) {
        boolean result = true;
        if (libri.contains(b)) {
            result = false;
        } else {
            libri.add(b);
        }
        return result;
    }

    public boolean addBook1(Book b) {
        if (libri.contains(b)) {
            return false;
        }
        return libri.add(b);
    }

    /*
     * prende un libro come argomento e lo dà in prestito, a patto che sia
     * disponibile.
     * Se quel libro è già in prestito, restituisce false.
     * Se quel libro non è mai stato inserito nella biblioteca, lancia un'eccezione.
     */
    public boolean loanBook(Book b) {

        Book found = find(b).orElseThrow();

        if (found.isLoan()) {
            return false;
        }
        found.setLoanDate(LocalDateTime.now());
        return true;
    }

    /*
     * prende un libro come argomento e restituisce quel libro alla biblioteca.
     * Se quel libro non era stato prestato col metodo loanBook, il metodo
     * returnBook lancia
     * un'eccezione.
     */
    public void returnBook(Book b) {

        Book found = find(b).orElseThrow();
        if (!found.isLoan()) {
            throw new RuntimeException("book is not loan");
        }
        found.setLoanDate(null);
    }

    /*
     * • Il metodo printLoans stampa la lista dei libri attualmente in prestito, in
     * ordine temporale
     * (a partire dal libro in prestito da più tempo).
     */
    public void printLoan() {
        System.out.println("------------- Libri in prestito ----------------");
        for (Book book : libri) {
            if (book.isLoan()) {
                System.out.println(book);
            }
        }
    }

    private Optional<Book> find(Book b) {
        for (Book book : libri) {
            if (book.equals(b)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}
