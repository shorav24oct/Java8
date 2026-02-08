package org.example.classobj;

import org.example.classobj.db.EmpDB;
import org.example.classobj.db.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmpInEachDept {
    public static void main(String[] args) {
        List<Employee> employees = EmpDB.allEmp();

        Map<String, Optional<Employee>> highestPaid = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.maxBy(
                        Comparator.comparingDouble(Employee::getSalary)
                )));

        highestPaid.forEach((d,e) -> System.out.println(d + " -> " + e.get().getName()));
    }
}
