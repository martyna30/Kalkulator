package com.kodilla.spring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

@RunWith(SpringRunner.class) //mówi że trzeba wykonać kod klasy SpringRunner bo ona ma adntację: @SpringBootApplication co powoduje ze rozpoznawane są adnotacje @Component przy klasach
@SpringBootTest//mówi springowi że test dotyczy aplikacji opartej o spring boot
public class SpringRunnerTestSuite {
    @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");//tworze kontener
        Shape shape = context.getBean(Circle.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a circle", name);
    }

    @Test
    public void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Triangle.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is a triangle", name);
    }
}




