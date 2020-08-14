package com.kodilla.spring.reader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration//klasa konfiguracyjna
public class ReaderConfig {
    //@Autowired//wstrzykniecie przez własciwość (pole klasy)//ma być powiązane z new Book?
    //@Qualifier("book1")//jak jest kilka beanów takich samych to trzeba tej adnotacji
    //Book book;

    @Bean
    public Reader getReader() {
        return new Reader(getBookOne());//Autowired nie jest potrzebane jeśli podaje nazwe metody w konstruktorze jak bym podawała book to wtedy Autowired
    }

    @Bean(name = "book1")//nadanie nazwy beana zamiast domyślnej
    @Scope("prototype")
    public Book getBookOne() {
        return new Book("The book number one");
    }

    @Bean(name = "book2")
    @Scope("prototype")
    @Conditional(IfDayIsOddCondition.class)//bean zostanie utworzony gdy metoda matches klasy IfDay.. zwróci true
    public Book getBookTwo() {
        return new Book("The book number two");
    }
}




