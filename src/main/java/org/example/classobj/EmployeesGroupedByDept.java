package org.example.classobj;

import java.util.List;

public class EmployeesGroupedByDept {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1,"Amit",30,60000,"IT"),
                new Employee(2,"Ravi",28,50000,"HR"),
                new Employee(3,"Neha",35,80000,"IT"),
                new Employee(4,"Pooja",25,40000,"HR")
        );
    }
}
