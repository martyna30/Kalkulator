package com.kodilla.exception.test;

import java.util.Objects;

public class Flight {
    private String arrivalAirport;
    private String departureAiport;

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAiport() {
        return departureAiport;
    }

    public Flight(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Flight(){}

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public void setDepartureAiport(String departureAiport) {
        this.departureAiport = departureAiport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "arrivalAirport='" + arrivalAirport + '\'' +
                ", departureAiport='" + departureAiport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(arrivalAirport, flight.arrivalAirport) &&
                Objects.equals(departureAiport, flight.departureAiport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrivalAirport, departureAiport);
    }
}
