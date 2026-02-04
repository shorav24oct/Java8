package org.example;

import java.util.Arrays;
import java.util.List;

public class StringLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("anu", "paru", "sharma");

        list.stream()
                .map(String::length)
                .forEach(System.out::println);

        list.forEach(s -> System.out.println(s + " -> " + s.length()));

    }
}
