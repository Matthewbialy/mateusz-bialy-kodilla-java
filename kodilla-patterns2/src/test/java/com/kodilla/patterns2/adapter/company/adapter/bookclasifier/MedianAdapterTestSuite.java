package com.kodilla.patterns2.adapter.company.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookA = new HashSet<>();

        bookA.add(new Book("Steven King", "Lowca snow", 2001, "0920201"));
        bookA.add(new Book("Steven King", "World", 2012, "920202"));
        bookA.add(new Book("Steven King", "Seciure", 2012, "092622"));
        bookA.add(new Book("Sienkiewicz", "Potop", 1989, "0928282"));

        //When
        int mediana =  medianAdapter.publicationYearMedian(bookA);
        //Then
        Assert.assertEquals(2012, mediana);
    }
}
