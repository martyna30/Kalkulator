package com.kodilla.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //tą klase trzeba wykoanć alby beany z klasy z adnotacj
public class SpringRunner {

    public static void main (String[] args) {
        SpringApplication.run(SpringRunner.class, args);
    }
}
