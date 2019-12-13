package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test suite: end");
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(8);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        oddNumbersExterminator.exterminate(list);
        ArrayList<Integer> listEven = oddNumbersExterminator.getListEven();
        //Then
        Assert.assertFalse("I test or were removed odd values ", listEven.contains(1));
        Assert.assertTrue("I test or were remained even values", listEven.contains(2));
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //When
        list.clear();
        //Then
        Assert.assertTrue("I test or list is empty",list.isEmpty());
    }
}




