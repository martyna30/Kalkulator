package com.kodilla.patterns2.adapter.bookclasifier.librarya;

public class Book {
    private  String author;
    private  String title;
    private  String publicationYear;
    private  String signature;

    public Book(final String author, final String title,
                final String publicationYear, final String signature) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public String getSignature() {
        return signature;
    }
}
