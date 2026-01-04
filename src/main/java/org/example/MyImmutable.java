package org.example;

import java.util.*;
import java.util.stream.Collectors;

public final class MyImmutable {

    private final String name;
    private final Date doj;
    private final List<Integer> mobile;

    public MyImmutable(String name, Date doj, List<Integer> mobile) {
        this.name = name;
        this.doj = doj;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {
        return (Date) doj.clone();
    }

    public List<Integer> getMobile() {
        //return Collections.unmodifiableList(mobile);
        return new ArrayList<>(mobile);
    }

    @Override
    public String toString() {
        return "MyImmutable{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", mobile=" + mobile +
                '}';
    }

    public static void main(String[] args) {
        MyImmutable myImmutable = new MyImmutable("shorav", new Date(),
                Arrays.stream(new Integer[]{123, 456}).collect(Collectors.toList()));
        System.out.println(myImmutable);

        myImmutable.getDoj().setDate(15);
        System.out.println(myImmutable);

        myImmutable.getMobile().add(789);
        System.out.println(myImmutable);
    }
}
