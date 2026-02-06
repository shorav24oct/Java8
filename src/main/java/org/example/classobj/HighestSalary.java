package org.example.classobj;

import java.util.Comparator;
import java.util.List;

public class HighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = EmpDB.allEmp();

        Employee employee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary)).get();

        System.out.println(employee.getName());
    }
}
