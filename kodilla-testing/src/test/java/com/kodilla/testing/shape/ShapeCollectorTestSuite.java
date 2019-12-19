package com.kodilla.testing.shape;

import org.junit.*;
import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test suit: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test suit: end");
    }

    @Before
    public void before() {
        System.out.println("Test case begin");

    }
    @After
    public void after() {
        System.out.println("Test case end");
    }
    @Test
    public void testAddFigure() {
        //Given
        ArrayList<Shape> listShape = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        //Then
        Assert.assertTrue(shapeCollector.listShape.contains(square));
        Assert.assertTrue(shapeCollector.listShape.contains(circle));
        Assert.assertTrue(shapeCollector.listShape.contains(triangle));
    }
    @Test
    public void testGetFigure() {
        //Given
        ArrayList<Shape> listShape = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.getFigure(0);
        shapeCollector.getFigure(1);
        shapeCollector.getFigure(2);
        int listShapeDimension = shapeCollector.listShape.size();
        //Then
        Assert.assertEquals(3, listShapeDimension);
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ArrayList<Shape> listShape = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        //When
        shapeCollector.removeFigure(circle);
        shapeCollector.removeFigure(square);
        shapeCollector.removeFigure(triangle);
        int listShapeDimension = shapeCollector.listShape.size();
        //Then
        Assert.assertEquals(0, listShapeDimension);
    }
}


