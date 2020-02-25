package com.kodilla.good.patterns.flight2;

import java.util.*;
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

        String cityDestination = "Gdańsk";

        Set<Flight> getFlightsToCity = flightsSet.getFlightsSet().stream()
                .filter(flight1 -> flight1.getArrives().equals("Gdańsk")).
                        collect(Collectors.toSet());

        System.out.println("You have " + getFlightsToCity.size() + " connection to Gdańsk.");

        getFlightsToCity.stream().forEach(System.out::println);

        getFlightsFromCity.stream()
                .forEach(flightsFromCity -> getFlightsToCity.stream()
                        .filter(flightsToCity -> flightsToCity.getDeparture().equals(flightsFromCity.getArrives()))
                        .forEach(flightsToCity -> System.out.println("You have flights indrect: " + flightsFromCity.getDeparture()
                                + " -> " + flightsToCity.getDeparture() + " -> " + flightsToCity.getArrives())));
    }
}





