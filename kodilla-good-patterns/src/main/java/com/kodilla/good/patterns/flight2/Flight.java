package com.kodilla.good.patterns.flight2;

public class City {

    String start;
    String destination;
    String indirect;
    String name;

    public City(String start, String indirect, String destination) {
    this.start = start;
    this.destination = destination;
    this.indirect = indirect;
    }

    public String getStart() {
        return start;
    }

    public String getDestination() {
        return destination;
    }

    public String getIndirect() {
        return indirect;
    }

    public String getName() {
        return name;
    }
}

