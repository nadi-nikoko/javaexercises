package javaClass.ObjectedOriented.library_ex01;

import java.time.LocalDateTime;

public class Book {
    private String bookName;
    private boolean available;
    private LocalDateTime loanDate;

    public Book(String bookName) {
        this.bookName = bookName;
        this.available = true;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (bookName == null) {
            if (other.bookName != null)
                return false;
        } else if (!bookName.equals(other.bookName))
            return false;
        return true;
    }

    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book [bookName=" + bookName + ", available=" + available + ", loanDate=" + loanDate + "]";
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
