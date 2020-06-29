package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightMap {
    final Map<String, Boolean> flights = new HashMap();

    public void findFlight(Flight flight) throws RouteNotFoundException {
        flights.put(new Flight("Kraków").getArrivalAirport(),true);
        flights.put("Wrocław", true);
        flights.put("Gdańsk", false);
        System.out.println(flights);
        if (!flights.containsKey(flight.getArrivalAirport())
            || flights.get(flight.getArrivalAirport()) == false
        ) {
            throw new RouteNotFoundException("brak lotu");
        }
        System.out.println("Znaleziono");
    }

    public Map<String, Boolean> getFlights() {
        return flights;
    }
}


    /*if (flights.entrySet().contains(flight.getArrivalAirport())) {
            System.out.println("Znaleziono lot");
        } else {
            throw new RouteNotFoundException();
        }
    }*/


