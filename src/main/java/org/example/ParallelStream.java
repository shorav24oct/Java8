package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList());
        list.parallelStream().forEach(System.out::print);
    }
}
