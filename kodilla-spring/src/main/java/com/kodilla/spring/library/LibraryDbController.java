package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

//@Repository //odpowiedzialna za składownaie danych w bazach danych

public final class LibraryDbController {
    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadData() {
        System.out.println("Loading data from the database");
    }
}
