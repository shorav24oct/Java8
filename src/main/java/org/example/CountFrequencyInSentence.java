package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Count Frequency of words in a sentence
 */
public class CountFrequencyInSentence {
    public static void main(String[] args) {
        String s = "java is java and java is powerful";

        Map<String, Long> countMap = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap);
    }
}
