package org.example.classobj;

import org.example.classobj.db.EmpDB;
import org.example.classobj.db.Employee;

import java.util.Comparator;
import java.util.List;

public class SortBySalThenName {
    public static void main(String[] args) {
        List<Employee> employees = EmpDB.allEmp();

        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
                        .thenComparing(Employee::getName))
                .forEach(e -> System.out.println(e.getName() + " -> " + e.getSalary()));
    }
}
