package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.id == o.id)
            return 0;
        else if (this.id > o.id) {
            return 1;
        } else
            return -1;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee("def", 123);
        Employee employee2 = new Employee("xyz", 789);
        Employee employee3 = new Employee("abc", 123);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        //Collections.sort(employeeList);

        Collections.sort(employeeList, new EmployeeNameComparator());

        System.out.println(employeeList);
    }
}
