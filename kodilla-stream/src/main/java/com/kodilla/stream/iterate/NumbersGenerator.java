package com.kodilla.stream.iterate;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.Stream;

public final class NumbersGenerator {
    public static void generateEven(int max) {
        Stream.iterate(1, n -> n + 1)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}


