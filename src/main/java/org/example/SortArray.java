package org.example;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        functionalStyle(arr);
    }

    private static void functionalStyle(int[] arr) {
        int[] sorted = Arrays.stream(arr).sorted().toArray();

        System.out.println(Arrays.toString(sorted));
    }
}
