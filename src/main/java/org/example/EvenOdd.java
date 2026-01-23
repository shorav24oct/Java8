package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        List<Integer> evenList = Arrays.stream(arr).boxed().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
