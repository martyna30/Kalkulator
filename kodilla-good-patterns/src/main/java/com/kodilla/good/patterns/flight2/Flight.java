package com.kodilla.good.patterns.flight2;

import java.util.*;

public final class Flight {

    private final String departure;
    private final String indirect;
    private final String arrives;

    public Flight(final String departure, final String indirect, final String arrives) {
    this.departure = departure;
    this.arrives = arrives;
    this.indirect = indirect;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrives() {
        return arrives;
    }

    public String getIndirect() {
        return indirect;
    }

    @Override
    public String toString() {
        return "Flight: " +
                "departure from " + departure +
                ", to " + arrives;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) &&
                Objects.equals(indirect, flight.indirect) &&
                Objects.equals(arrives, flight.arrives);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrives);
    }
}

