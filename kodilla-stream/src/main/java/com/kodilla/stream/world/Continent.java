package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String nameContinent;
    private List<Country> listContryOnContinent = new ArrayList<>();

    public Continent(final String nameContinent, final List<Country>listContryOnContinent) {
        this.nameContinent = nameContinent;
        this.listContryOnContinent = listContryOnContinent;
    }

    public void addCountryToContinent(Country country) {
        listContryOnContinent.add(country);
    }

    public List<Country> getListContryOnContinent() {
        return listContryOnContinent;
    }
}
