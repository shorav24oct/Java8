package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 3, 5);

        Set<Integer> seen = new HashSet<>();

        Set<Integer> collect = list.stream()
                .filter(element -> !seen.add(element))
                .collect(Collectors.toSet());

        System.out.println(collect);
    }
}
