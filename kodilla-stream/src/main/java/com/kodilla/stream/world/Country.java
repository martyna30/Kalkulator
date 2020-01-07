package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String nameOfCountry;
    private final BigDecimal quantityPeople;

    public Country(final String nameOfCountry, final BigDecimal quantityPeople) {
        this.nameOfCountry = nameOfCountry;
        this.quantityPeople = quantityPeople;
    }

    public BigDecimal getPeopleQuantity(){
        return quantityPeople;
    }
}
