package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoryMain {
    public static void main(String[] args) {
        String movieStory = MovieStory.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("! "));
        System.out.println(movieStory);
    }
}
