package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
     static double getAverage(int[] numbers) {
        double numberSum = IntStream.range(0, numbers.length)
                .reduce(0, (sum, current) -> sum += current);
        System.out.println(numberSum);
       double average = IntStream.range(0, numbers.length)
               .average().getAsDouble();
         return average;
     }
}
