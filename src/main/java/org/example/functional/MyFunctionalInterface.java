package org.example.functional;

@FunctionalInterface
public interface MyFunctionalInterface {

    int sum(int a, int b);

    default void m2() {
        System.out.println("Default Method 1");
    }

    default void m3() {
        System.out.println("Default Method 2");
    }

    static void m4() {
        System.out.println("MyFunctionalInterface.m4");
    }
}
