package org.example.mapVsFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = EkartDataBase.getAll();

        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail()  one to one mapping
        List<String> customerEmail1 = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(customerEmail1);

        // Use of Method Reference
        List<String> customerEmail2 = customers.stream().map(Customer::getEmail).collect(Collectors.toList());

        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbers);

        List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phones);
    }
}
