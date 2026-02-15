package org.example.coreJava.walmart;

public interface B {
    default void hi() {
        System.out.println("B");
    }
}
