package org.example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestOccurrenceAndCount {
    public static void main(String[] args) {
        Map<Integer, Long> collect = Stream.of(2, 1, 3, 3, 2, 8, 9, 4, 5, 2, 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<Integer, Long> entry1 = collect.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .findFirst().get();

        Map.Entry<Integer, Long> entry2 = collect.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();

        System.out.println(entry1);
        System.out.println(entry2);

        System.out.println("********");

        collect.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.<Integer, Long>comparingByKey().reversed())
                )
                .forEach((e -> System.out.println(e.getKey() + " -> " + e.getValue())));
    }
}
