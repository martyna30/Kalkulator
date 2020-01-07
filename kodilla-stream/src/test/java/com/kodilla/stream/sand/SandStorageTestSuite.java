package com.kodilla.stream.sand;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {
    @Test
    public void testGetSandBeansQuantity() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());
        //When
        BigDecimal totalSand = BigDecimal.ZERO; //BigDecimal totalSand = new BigDecimal("0"); inicjalizacja
        for (SandStorage continent : continents) {
            totalSand = totalSand.add(continent.getSandBeansQuantity());//każde przypisanie tworzy nowy obiekt
        }
        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand, totalSand);
    }

    @Test
    public void testGetSandBeansQuantityWithReduce() {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());
        //When
        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandBeansQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));//wartość początkowa, dotychczas obliczona wartość pośrednia(sum),
        // current- bieżący obiekt w strumieniu. Kolektor skalarny reduce wykonuje sie dla każdej liczby w kolekcji.
    }
}
