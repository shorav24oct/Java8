package org.example.coreJava.walmart;

public class AB implements A, B {

    @Override
    public void hi() {
        A.super.hi();
    }
}
