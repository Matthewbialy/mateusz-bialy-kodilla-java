package com.kodilla.good.patterns.challenges;

import sun.awt.SunHints;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChallengeOne {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> theList = movieStore.getMovies();

        String text = theList.entrySet().stream()
                .map(Map.Entry::getValue)
                .flatMap(n->n.stream())
                .collect(Collectors.joining("!"));

               System.out.println(text);




    }
}
