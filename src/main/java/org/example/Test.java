package org.example;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Set<Integer> collect = Arrays.asList(1, 1, 2, 2, 3).stream().collect(Collectors.toSet());
        System.out.println(collect);
    }
}
