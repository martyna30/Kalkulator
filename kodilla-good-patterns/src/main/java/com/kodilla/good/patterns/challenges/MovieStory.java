package com.kodilla.good.patterns.challenges;

import java.util.*;

public final class MovieStory {
    final List<String> ironManTranslations = new ArrayList<>();
    final List<String> avengersTranslations = new ArrayList<>();
    final List<String> flashTranslations = new ArrayList<>();

    public static Map<String, List<String>> getMovies() {

        final List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        final List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        final List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        final Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return new HashMap<>(booksTitlesWithTranslations);
    }

    public List<String> getIronManTranslations(String s) {
        return ironManTranslations;
    }
}


