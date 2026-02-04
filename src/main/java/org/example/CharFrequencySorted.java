package org.example;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequencySorted {
    public static void main(String[] args) {
        String str = "cbbaaa";

        // Sort by Count (Ascending)
        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e ->
                        System.out.println(e.getKey() + " -> " + e.getValue())
                        );

    }
}
