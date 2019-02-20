package com.kodilla.patterns.singleton.library;

import com.kodilla.patterns.library.Book;
import com.kodilla.patterns.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("Our Books 1");
        library.getBooks().add(new Book("Shuter", "S.King", LocalDate.ofYearDay(1991, 21)));
        library.getBooks().add(new Book("Sunset", "L.J.Lambert", LocalDate.ofYearDay(2002, 11)));

        Book book = new Book("World", "S.King", LocalDate.ofYearDay(1992, 22));
        book.getAuthor();
        book.getTitle();
        book.getPublicationDate();

        Library clonedBook = null;
        try {
            clonedBook = library.shallowCopy();
            ((Library) clonedBook).setName("Our Books 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedBook = null;
        try {
            deepClonedBook = library.deepCopy();
            deepClonedBook.setName("Our Books 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book);
        //Then

        System.out.println(library);
        System.out.println(clonedBook);
        System.out.println(deepClonedBook);

        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedBook.getBooks().size());
        Assert.assertEquals(2, deepClonedBook.getBooks().size());
    }
}

