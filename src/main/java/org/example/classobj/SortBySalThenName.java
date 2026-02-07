package org.example.classobj;

import java.util.Comparator;
import java.util.List;

public class SortBySalThenName {
    public static void main(String[] args) {
        List<Employee> employees = EmpDB.allEmp();

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()
                        .thenComparing(Employee::getName))
                .forEach(e -> System.out.println(e.getName() + " -> " + e.getSalary()));
    }
}
