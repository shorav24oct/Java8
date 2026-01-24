package org.example.coreJava;

/*
Java is pass-by-value.
For primitives, the value is copied, so changing the parameter does not affect the original variable.
 */
public class PassByValue {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);
    }

    private static void change(int x) {
        /*
            x = 10   // copy
            x = 100  // only local copy changes
         */
        x = 100;
    }
}
