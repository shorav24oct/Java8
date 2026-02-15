package org.example.coreJava.immutable;

public class Address {
    String city;
    Integer pin;

    public Address(String city, Integer pin) {
        this.city = city;
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pin=" + pin +
                '}';
    }
}
