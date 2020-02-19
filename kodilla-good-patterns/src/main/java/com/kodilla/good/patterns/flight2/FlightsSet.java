package com.kodilla.good.patterns.flight2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class FlightsSet {
    private final Set<Flight> flightsSet = new HashSet<>();

    public FlightsSet() {
        flightsSet.add( new Flight("Wrocław", "Kraków","Gdańsk"));
        flightsSet.add( new Flight("Wrocław", "Katowice","Gdańsk"));
        flightsSet.add( new Flight("Gdańsk", "Kraków","Wrocław"));
        flightsSet.add( new Flight("Gdańsk", "Katowice","Wrocław"));
        flightsSet.add(new Flight("Warszawa","Kraków","Gdańsk"));
    }

    public Set<Flight> getFlightsSet() {
        return flightsSet;
    }

    @Override
    public String toString() {
        return "FlightsSet{" +
                "flightsSet=" + flightsSet +
                '}';
    }
}
