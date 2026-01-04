package org.example;

import java.util.*;
import java.util.stream.Collectors;

public final class MyImmutable {

    private final String name;
    private final Date doj;
    private final List<Integer> mobile;
    private final Address address;

    public MyImmutable(String name, Date doj, List<Integer> mobile, Address address) {
        this.name = name;
        this.doj = doj;
        this.mobile = mobile;
        this.address = address;
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

    public Address getAddress() {
        // return address;
        return new Address(address.getCity(), address.getPin());
    }

    @Override
    public String toString() {
        return "MyImmutable{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", mobile=" + mobile +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address address1 = new Address("Pune", 144041);

        MyImmutable myImmutable = new MyImmutable("shorav", new Date(),
                Arrays.stream(new Integer[]{123, 456}).collect(Collectors.toList()), address1);
        System.out.println(myImmutable);

        myImmutable.getDoj().setDate(15);
        System.out.println(myImmutable);

        myImmutable.getMobile().add(789);
        System.out.println(myImmutable);

        myImmutable.getAddress().setCity("Noida");
        System.out.println(myImmutable);
    }
}
