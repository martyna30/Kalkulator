package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlightSet {
    private final Set<Flight> flightsSet = new HashSet();

    public void FlightSet() {
        flightsSet.add(new Flight("Wrocław", "Sopot"));
        flightsSet.add(new Flight("Warszawa", "Gdańsk"));
        //flighSet.add(new Flight("Gdańsk", "Kraków"));
        //flighSet.add(new Flight("Poznań", "Wrocław"));
        //flighSet.add(new Flight("Kraków", "Gdańsk"));
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap();
        flightMap.put("Sopot",true);
        flightMap.put("Gdańsk", false);

        if (flightsSet.contains(flight) && flightMap.containsValue(true)) {
            System.out.println("Znaleziono lot");
        } else {
            throw new RouteNotFoundException();
        }
    }
}

