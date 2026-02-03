package org.example.functional;

public class MyFIImpl {

    public static void main(String[] args) {
        MyFunctionalInterface functionalInterface = (a, b) -> a + b;

        int sum = functionalInterface.sum(10, 20);
        System.out.println(sum);
    }
}
