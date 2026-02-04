package org.example;

import java.util.Arrays;
import java.util.List;

public class SumUsingSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        /*
        sum() exists on primitive streams (IntStream), not on Stream<Integer>.
         */
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

    }
}
