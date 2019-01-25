package com.kodilla.stream.book;

public final class Book {

    private final String author;
    private final String titile;
    private final int yearOfPublication;
    private final String signature;

    public Book(final String author, final String titile, final int yearOfPublication, final String signature) {
        this.author = author;
        this.titile = titile;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitile() {
        return titile;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" + "author='" + author + '\'' + ", title='" + titile + '\'' + ", yearsOfPublication=" + yearOfPublication + ", signatur='" + signature + '}';
    }
}
