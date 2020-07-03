package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void testLibraryAdapter() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("J.D. Salinger", "The Catcher in the Rye", "1951","001"));
        bookSet.add(new Book("Jane Austen","Pride and Prejudice","1813","002"));
        bookSet.add(new Book("Chinua Achebe","Things Fall Apart","1989","003"));
        bookSet.add(new Book("William Golding","Lord of the Flies","1954","004"));

        //When
        int mediana = medianAdapter.publicationYearMedian(bookSet);

        System.out.println(mediana);

        //Then
        Assert.assertEquals(1954, mediana);
        Assert.assertEquals(4, bookSet.size());
    }
}
