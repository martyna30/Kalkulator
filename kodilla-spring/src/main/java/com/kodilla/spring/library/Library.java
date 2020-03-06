package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service//adnotacja o działaniu takim samym, jak @Component,ale bardziej złożone usługi.
public final class Library {
    private final List<String> books = new ArrayList<>();

     LibraryDbController libraryDbController;
    /*@Autowired //wstrzyknięcia zaleznosci do własciwości klasy /do pola klasy
    private LibraryDbController libraryDbController;
    @Autowired
    public void setLibraryDbController(LibraryDbController libraryDbController) {//wstrzykniecie zaleznosci przez metode nie zalecae bo obiekt ma byc niemutowalny
        this.libraryDbController = libraryDbController;
    }
    @Autowired
    public Library(final LibraryDbController libraryDbController) {//wstrzyknieie zaleznosci przez konstruktor
        this.libraryDbController = libraryDbController;
    }*/
    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library(){}

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
