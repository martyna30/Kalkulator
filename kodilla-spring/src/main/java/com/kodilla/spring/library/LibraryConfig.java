package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //konfiguracja przez klase konfiguracyjną
public class LibraryConfig {

    @Bean
    public Library library() {
        return new Library(libraryDbController());//jawne wstrzyknięcie przez konstruktor(new)
    }
    @Bean
    public LibraryDbController libraryDbController() {
        return new LibraryDbController();
    }
}
