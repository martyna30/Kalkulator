package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        Library library = new Library("Affiliate nr 1");
        //Book book = new Book();
        library.getBooks().add(new Book("The Trial","Franz Kafka", LocalDate.of(1914,9,2)));
        library.getBooks().add(new Book("Heart of Darkness","Joseph Conrad", LocalDate.of(1911,8,3)));
        library.getBooks().add(new Book("Gone With the Wind","Margaret Mitchell", LocalDate.of(1936,5,12)));
        library.getBooks().add(new Book("The Tin Drum","Günter Grass", LocalDate.of(1979,8,22)));
        /*for(int i = 0; i < 10; i++) {
            library.getBooks().add(book);
            i++;
        }*/
        System.out.println(library.getBooks().size());

        Library clonedLibrary = null;
        try{
           clonedLibrary = library.shallowCopy();
           clonedLibrary.setName("Affiliate nr 2");
        }
        catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Affiliate nr 3");
        } catch(CloneNotSupportedException e ) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
    }
}

