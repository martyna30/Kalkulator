package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import sun.jvm.hotspot.gc.shared.GCWhen;

@SpringBootTest

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(6,2);
        double result1 = calculator.sub(6,2);
        double result2 = calculator.mul(6,2);
        double result3 = calculator.div(6,2);
        //Then
        Assert.assertEquals(8, result,0.1);
        Assert.assertEquals(4, result1,0.1);
        Assert.assertEquals(12, result2,0.1);
        Assert.assertEquals(3, result3,0.1);
    }
}
