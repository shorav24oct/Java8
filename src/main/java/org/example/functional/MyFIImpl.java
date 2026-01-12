package org.example.functional;

public class MyFIImpl {

    public static void main(String[] args) {
        /*
        @Override
    public void m1() {

    }
         */

        MyFunctionalInterface myFunctionalInterface1 = () -> { System.out.println("Switch On"); };

        MyFunctionalInterface myFunctionalInterface2 = () -> System.out.println("Switch On");
    }
}
