package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int [] numbers = new int[] {1,2,3,4,5};
        //when
        double averageNumber = ArrayOperations.getAverage(numbers);
       //Then
        Assert.assertEquals(3, averageNumber, 0.1) ;
    }
}

