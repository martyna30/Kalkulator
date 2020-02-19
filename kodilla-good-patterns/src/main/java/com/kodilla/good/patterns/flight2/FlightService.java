package com.kodilla.good.patterns.flight2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {
    public static void main(String[] args) {

       FlightsSet flightsSet = new FlightsSet();

       String cityDeparture = "Wrocław";

       Set<Flight> getFlightsFromCity = flightsSet.getFlightsSet().stream()
                .filter(flight1 -> flight1.getDeparture().equals("Wrocław")).
                        collect(Collectors.toSet());

        System.out.println("You have " + getFlightsFromCity.size() + " connection from Wrocław.");

        getFlightsFromCity.stream().forEach(System.out::println);

        String cityDestination = "Wrocław";

        Set<Flight> getFlightsToCity = flightsSet.getFlightsSet().stream()
                .filter(flight1 -> flight1.getArrives().equals("Gdańsk")).
                        collect(Collectors.toSet());

        System.out.println("You have " + getFlightsToCity.size() + " connection to Gdańsk.");

        getFlightsToCity.stream().forEach(System.out::println);

        String cityIndirect = "Kraków";

        Set<Flight> getFlightsIndirect = flightsSet.getFlightsSet().stream()
                .filter(flight1 -> flight1.getIndirect().equals("Kraków")).
                        collect(Collectors.toSet());

        System.out.println("You have " + getFlightsIndirect.size() + " connection indirect Kraków.");

        getFlightsIndirect.stream().forEach(System.out::println);
    }
}
