package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.mockito.Matchers.anyString;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionReturnList() {

        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Almo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directores", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());


    }

    public List<Book> generateListOfNBooks(int booksQuanity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuanity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {


        //Given

        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListof0Books = new ArrayList<Book>();
        when(libraryDatabaseMock.listBooksWithCondition("Zero Books")).thenReturn(resultListof0Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");

        //Then
        assertEquals(0, theListOfBooks0.size());


    }

    @Test
    public void testListBooksWithConditionfragmentShoreterThan3() {

        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOf0() {
        //Given
        LibraryUser libraryUser = new LibraryUser("Matthew", "Bialy", "920102");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListBooksInHandsOf0 = generateListOfNBooks(0);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListBooksInHandsOf0);

        //When
        List<Book> theListBooksInHandsOf0 = bookLibrary.listBooksInHandsOf(libraryUser);


        //Then
        assertEquals(0, theListBooksInHandsOf0.size());

    }

    @Test
    public void testListBooksInHandsOf1() {
        //Given
        LibraryUser libraryUser = new LibraryUser("Matthew", "Bialy", "91028382");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListInHandsOf1 = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListInHandsOf1);

        //When
        List<Book> theListBooksInHandsof1 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(1, theListBooksInHandsof1.size());
    }

    @Test
    public void testListBooksInHandsOf5() {
        //Given
        LibraryUser libraryUser = new LibraryUser("Matthew", "Bialy", "8282992");
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListInHandOf5 = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListInHandOf5);

        //When
        List<Book> theListBooksinHandsOf5 = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(5, theListBooksinHandsOf5.size());
    }

}
