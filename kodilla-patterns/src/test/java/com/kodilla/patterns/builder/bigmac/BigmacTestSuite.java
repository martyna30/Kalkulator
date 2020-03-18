package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun with sesame")
                .burgers(2)
                .ingredient("Cucumber")
                .ingredient("Chili pepper")
                .ingredient("Lettuce")
                .sauce("Thousand Island dressing")
                .build();
        System.out.println(bigmac);
        //When
        int ingredientsAmount = bigmac.getIgredients().size();
        int burgersAmount = bigmac.getBurgers();
        String sauceBigmac = bigmac.getSouce();
        //Then
        Assert.assertEquals(3, ingredientsAmount);
        Assert.assertEquals(2, burgersAmount);
        Assert.assertEquals("Thousand Island dressing", sauceBigmac);
    }
}

