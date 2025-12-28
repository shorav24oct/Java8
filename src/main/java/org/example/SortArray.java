package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        functionalStyle(arr);
        descendingOrder(arr);
    }

    private static void descendingOrder(int[] arr) {
        int[] sortedDesc = Arrays
                .stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(sortedDesc));
    }

    private static void functionalStyle(int[] arr) {
        int[] sorted = Arrays.stream(arr).sorted().toArray();

        System.out.println(Arrays.toString(sorted));
    }
}
