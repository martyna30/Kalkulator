package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSygnature, Book> books);
    int medianPublicationYear(Map<BookSygnature, Book> books);
}
