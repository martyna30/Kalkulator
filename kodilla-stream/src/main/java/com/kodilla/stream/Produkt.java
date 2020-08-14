package com.kodilla.stream;

public class Produkt {
    private double cena;
    private String nazwa;
    public Produkt(double cena, String nazwa) {
        this.cena = cena;
        this.nazwa = nazwa;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String toString() {
        return "Produkt o nazwie " + nazwa + " kosztuje " + cena;
    }

}
