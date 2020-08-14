package com.kodilla.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //tą klase trzeba wykoanć alby beany z klasy z adnotacją zostały rozpoznane przez springa,musi ona byc w najwyzszym pakiecie to działa wtedy dla wszystkich podpakietow
public class SpringRunner {

    public static void main (String[] args) {
        SpringApplication.run(SpringRunner.class, args);//uruchomienie kontenera
    }
}
