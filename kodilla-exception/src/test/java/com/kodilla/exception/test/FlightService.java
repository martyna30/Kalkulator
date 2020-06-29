package com.kodilla.exception.test;

public class FlightService {
    public static void main(String[] args) {
        FlightMap flightMap = new FlightMap();

        try {
            flightMap.findFlight(new Flight("Wrocław"));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}






