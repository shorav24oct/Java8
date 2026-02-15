package org.example.threads;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrintEvenOdd {

    static Object object = new Object();

    static IntPredicate evenPredicate = e -> e % 2 == 0;
    static IntPredicate oddPredicate = e -> e % 2 != 0;

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(() -> PrintEvenOdd.printResult(oddPredicate));
        CompletableFuture.runAsync(() -> PrintEvenOdd.printResult(evenPredicate));
        Thread.sleep(1000);
    }

    static void printResult(IntPredicate condition) {
        IntStream.rangeClosed(1, 10)
                .filter(condition)
                .forEach(PrintEvenOdd::execute);
    }

    static void execute(int i) {
        synchronized (object) {
            try {
                System.out.println("Thread name: " + Thread.currentThread().getName() + " : " + i);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
