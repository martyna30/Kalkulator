package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder("Tomatosouce", "cheese", new ArrayList());
        theOrder = new CapricciosaPizzaOrder(theOrder);
        theOrder = new PepperoniPizzaOrder(theOrder);
        //When
        BigDecimal price = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(40), price);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder("Tomatosauce", "cheese", new ArrayList());
        theOrder = new CapricciosaPizzaOrder(theOrder);
        theOrder = new PepperoniPizzaOrder(theOrder);
        //When
        String desc = theOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza with Tomato sauce, cheese and ham, olives and mushrooms and pepperoni", desc);
    }
    @Test
    public void testBasicPizzaOrderGetIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder("Tomatosouce", "cheese", new ArrayList());
        theOrder = new CapricciosaPizzaOrder(theOrder);
        theOrder = new PepperoniPizzaOrder(theOrder);
        //When
        List<String> ingrendients = theOrder.getIngredients();
        //Then
        Assert.assertEquals(2, ingrendients.size());
    }
}
