package org.example.coreJava;

import java.util.ArrayList;
import java.util.List;

/*
Java is always pass-by-value.
For objects, the value passed is the reference, so modifications to the object are visible, but reassigning the reference is not.
 */
public class PassByValueObjects {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        change(l);
        System.out.println(l.size());

    }

    private static void change(List<Integer> list) {
        list.add(100);
    }
}
