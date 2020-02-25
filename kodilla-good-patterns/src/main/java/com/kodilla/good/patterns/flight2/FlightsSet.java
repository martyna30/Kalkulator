package com.kodilla.good.patterns.flight2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class FlightsSet {
    private final Set<Flight> flightsSet = new HashSet<>();

    public FlightsSet() {
        flightsSet.add( new Flight("Wrocław", "","Poznań"));
        flightsSet.add( new Flight("Poznań", "","Gdańsk"));
        flightsSet.add( new Flight("Gdańsk", "","Wrocław"));
        flightsSet.add( new Flight("Gdańsk", "","Warszawa"));
        flightsSet.add(new Flight("Warszawa","","Gdańsk"));
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
