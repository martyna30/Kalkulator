package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> countryListEuropa = new ArrayList<>();
        countryListEuropa.add(new Country("Poland", new BigDecimal(123456789)));
        countryListEuropa.add(new Country("Netherlands", new BigDecimal(234561)));
        //When
        World world = new World();
        world.addContinent(new Continent("Europa", countryListEuropa));
        BigDecimal totalQuantityPeopleOnWorld = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(new BigDecimal("123691350"), totalQuantityPeopleOnWorld);
    }
}
