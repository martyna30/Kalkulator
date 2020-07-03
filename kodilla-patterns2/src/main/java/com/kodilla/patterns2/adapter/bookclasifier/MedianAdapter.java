package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSygnature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSygnature, Book> books = new HashMap<>();

        for (com.kodilla.patterns2.adapter.bookclasifier.librarya.Book b : bookSet) {
            books.put(new BookSygnature(b.getSignature()),new Book(b.getAuthor(), b.getTitle(), Integer.valueOf(b.getPublicationYear())));
        }
        return medianPublicationYear(books);
    }
}

