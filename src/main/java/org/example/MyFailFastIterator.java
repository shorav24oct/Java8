package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyFailFastIterator {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();

        list.add(1);
        list.add(2);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
            list.add(3);
        }
    }
}
