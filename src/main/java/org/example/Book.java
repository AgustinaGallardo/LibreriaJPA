package org.example;

import jakarta.persistence.*;

@Entity
@Table
public class Book {
    @Id
    @GeneratedValue
    private long isbn;
    private String title;
    private Integer year;
    private Integer copy;
    private Integer BorrowedCopies;
    private Integer remainingCopies;
    private boolean alta;
    @ManyToOne
    private Editorial editorial;
    @ManyToOne
    private Author author;

    public Book() {
    }

    public Book(long isbn, String title, Integer year, Integer copy, Integer borrowedCopies, Integer remainingCopies, boolean alta, Editorial editorial, Author author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.copy = copy;
        BorrowedCopies = borrowedCopies;
        this.remainingCopies = remainingCopies;
        this.alta = alta;
        this.editorial = editorial;
        this.author = author;
    }


    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCopy() {
        return copy;
    }

    public void setCopy(Integer copy) {
        this.copy = copy;
    }

    public Integer getBorrowedCopies() {
        return BorrowedCopies;
    }

    public void setBorrowedCopies(Integer borrowedCopies) {
        BorrowedCopies = borrowedCopies;
    }

    public Integer getRemainingCopies() {
        return remainingCopies;
    }

    public void setRemainingCopies(Integer remainingCopies) {
        this.remainingCopies = remainingCopies;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", copy=" + copy +
                ", BorrowedCopies=" + BorrowedCopies +
                ", remainingCopies=" + remainingCopies +
                ", alta=" + alta +
                ", editorial=" + editorial +
                ", author=" + author +
                '}';
    }
}
