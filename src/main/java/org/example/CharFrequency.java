package org.example;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "walmart";

        /*
        Java streams work on primitive int values for characters to support Unicode,
        so we convert using (char) c.
         */
        str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " -> " + v));

        System.out.println("*************");

        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
