package org.example;

import java.util.Arrays;
import java.util.List;

/*
Maximum value without Collections.max
 */
public class MaximumValueWithoutMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,7,2,9,1);

        Integer ans = list.stream()
                .reduce(Integer::max)
                .get();

        System.out.println(ans);
    }
}
